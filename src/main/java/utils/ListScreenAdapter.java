package utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>Title:      ListScreenAdapter. </p>
 * <p>Description List 筛选工具类 </p>
 *
 * @Author <a href="liqingdong"/>李清栋</a>
 * @CreateDate 2017/5/26 11:26
 */
public class ListScreenAdapter<T> {

    /**
     * <p>Title:      List筛选（只支持String类型）. </p>
     * <p>Description </p>
     *
     * @param objects      要筛选的List
     * @param propertyName 要筛选的属性名
     * @param objects      值
     * @return
     * @Author <a href="liqingdong"/>李清栋</a>
     * @CreateDate 2017/5/26 11:52
     */
    public List<T> screen(List<T> objects, String propertyName, String value) {
        Map<String, String> param = Maps.newHashMap();
        param.put(propertyName, value);
        return screen(objects, param);
    }

    /**
     * <p>Title:      多个条件查询. </p>
     * <p>Description </p>
     *
     * @param
     * @return
     * @Author <a href="liqingdong"/>李清栋</a>
     * @CreateDate 2017/5/27 11:24
     */
    public List<T> screen(List<T> objects, Map<String, String> param) {
        if (!validate(objects, param)) {
            return getEmptyValues();
        }

        List<T> objectPropertyElements = Lists.newArrayList();

        for (T v : objects) {
            Class<?> clazz = v.getClass();

            boolean is = true;
            for (String propertyName : param.keySet()) {
                // 查询属性在类中存不存在
                // private方法查询
                Field field = null;
                try {
                    field = clazz.getDeclaredField(propertyName);
                } catch (NoSuchFieldException e) {
                }
                // 查询不到找public方法
                if (field == null) {
                    try {
                        field = clazz.getField(propertyName);
                    } catch (NoSuchFieldException e) {
                    }
                }
                // 还是为空直接返回
                if (field == null) {
                    return getEmptyValues();
                }

                PropertyDescriptor pd;
                try {
                    pd = new PropertyDescriptor(field.getName(), clazz);
                } catch (IntrospectionException e) {
                    return getEmptyValues();
                }
                Method rM = pd.getReadMethod();

                try {
                    String result = (String) rM.invoke(v);
                    if (!result.equals(param.get(propertyName))) {
                        is = false;
                        break;
                    }
                } catch (IllegalAccessException ex) {
                    return getEmptyValues();
                } catch (InvocationTargetException ex) {
                    return getEmptyValues();
                }
            }
            if (is) {
                objectPropertyElements.add(v);
            }
        }
        return objectPropertyElements;

    }

    private boolean validate(List<T> objects, Map<String, String> param) {
        if (objects == null) {
            return false;
        }
        if (param == null || param.size() == 0) {
            return false;
        }
        return true;
    }

    /*public static void main(String[] args) {
        List<DpcDispatchDoc> list = Lists.newArrayList();
        DpcDispatchDoc d1 = new DpcDispatchDoc();
        d1.setSerialNo("1");
        d1.setDriverId("1");
        DpcDispatchDoc d2 = new DpcDispatchDoc();
        d2.setSerialNo("2");
        d2.setDriverId("2");
        DpcDispatchDoc d3 = new DpcDispatchDoc();
        d3.setSerialNo("3");
        d3.setDriverId("3");
        list.add(d1);
        list.add(d2);
        list.add(d3);

        ListScreenAdapter listScreenAdapter = new ListScreenAdapter();
        Map<String, String> param = Maps.newHashMap();
        param.put("serialNo", "3");
        param.put("driverId", "3");
        List<DpcDispatchDoc> result = listScreenAdapter.screen(list, param);
        System.out.print(result);
    }*/


    private List<T> getEmptyValues() {
        return new ArrayList<>(0);
    }

}
