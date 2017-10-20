package utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Title:      PropertyUtils. </p>
 * <p>Description 通过反射为对象属性赋值 </p>
 *
 * @Author <a href="liqingdong"/>李清栋</a>
 * @CreateDate 2017/5/13 15:11
 */
public class PropertyUtils {

    /**
     * 正则表达式 用于匹配属性的第一个字母 {@value [a-zA-Z]}
     **/
    private static final String REGEX = "[a-zA-Z]";

    public static void setProperty(Object obj, String propertyName, Object propertyValue) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException {

        String method_name = convertToMethodName(propertyName, obj.getClass(), true);
        Method[] methods = obj.getClass().getMethods();

        for (Method method : methods) {
            /**
             *     因为这里只是调用bean中属性的set方法，属性名称不能重复
             * 所以set方法也不会重复，所以就直接用方法名称去锁定一个方法
             * （注：在java中，锁定一个方法的条件是方法名及参数）
             * **/
            if (method.getName().equals(method_name)) {

                Class[] parameterC = method.getParameterTypes();
                try {
                    /**如果是基本数据类型时（如int、float、double、byte、char、boolean）
                     * 需要先将Object转换成相应的封装类之后再转换成对应的基本数据类型
                     * 否则会报 ClassCastException**/
                    if (parameterC[0] == int.class) {
                        method.invoke(obj, ((Integer) propertyValue).intValue());
                        break;
                    } else if (parameterC[0] == float.class) {
                        method.invoke(obj, ((Float) propertyValue).floatValue());
                        break;
                    } else if (parameterC[0] == double.class) {
                        method.invoke(obj, ((Double) propertyValue).doubleValue());
                        break;
                    } else if (parameterC[0] == byte.class) {
                        method.invoke(obj, ((Byte) propertyValue).byteValue());
                        break;
                    } else if (parameterC[0] == char.class) {
                        method.invoke(obj, ((Character) propertyValue).charValue());
                        break;
                    } else if (parameterC[0] == boolean.class) {
                        method.invoke(obj, ((Boolean) propertyValue).booleanValue());
                        break;
                    } else {
                        method.invoke(obj, parameterC[0].cast(propertyValue));
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalAccessException e) {
                    throw e;
                } catch (InvocationTargetException e) {
                    throw e;
                } catch (SecurityException e) {
                    throw e;
                }
            }
        }
    }

    private static String convertToMethodName(String attribute, Class objClass, boolean isSet) throws NoSuchFieldException {
        /** 通过正则表达式来匹配第一个字符 **/
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(attribute);
        StringBuilder sb = new StringBuilder();

        /** 如果是set方法名称 **/
        if (isSet) {
            sb.append("set");
        } else {
            /** get方法名称 **/
            try {
                Field attributeField = objClass.getDeclaredField(attribute);
                /** 如果类型为boolean **/
                if (attributeField.getType() == boolean.class || attributeField.getType() == Boolean.class) {
                    sb.append("is");
                } else {
                    sb.append("get");
                }
            } catch (SecurityException e) {
                throw e;
            } catch (NoSuchFieldException e) {
                throw e;
            }
        }
        /** 针对以下划线开头的属性 **/
        if (attribute.charAt(0) != '_' && m.find()) {
            sb.append(m.replaceFirst(m.group().toUpperCase()));
        } else {
            sb.append(attribute);
        }
        return sb.toString();
    }

    public static Object getProperty(Object obj, String propertyName) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        String methodName = convertToMethodName(propertyName, obj.getClass(), false);
        Object value = null;

        try {

            /** 由于get方法没有参数且唯一，所以直接通过方法名称锁定方法 **/
            Method methods = obj.getClass().getDeclaredMethod(methodName);
            if (methods != null) {
                value = methods.invoke(obj);
            }

        } catch (SecurityException e) {
            throw e;
        } catch (NoSuchMethodException e) {
            throw e;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalAccessException e) {
            throw e;
        } catch (InvocationTargetException e) {
            throw e;
        }
        return value;
    }

}