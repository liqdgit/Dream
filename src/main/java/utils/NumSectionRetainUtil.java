package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>Title:      NumSectionRetainUtil. </p>
 * <p>Description 数值区间值取交集 </p>
 *
 * @author         <a href="liqd163@163.com"/>李清栋</a>
 * @CreateDate     2017/12/14 16:33
 */
public class NumSectionRetainUtil {


    public static List<Integer> getSectionRetainAll(List<Integer> ... list){
        List<Integer> sectionList = null;
        if(list != null){

            List<List<Integer>> valueList = new ArrayList<>();
            for (List<Integer> numList: list){
                List<Integer> value = format(numList);
                if(value != null){
                    valueList.add(value);
                }
            }

            sectionList = valueList.get(0);
            for (int i = 1; i < valueList.size(); i++){
                sectionList.retainAll(valueList.get(i));
            }
        }
        return sectionList;
    }

    public static List<Integer> format(List<Integer> numList){
        int size = numList.size();
        if(numList == null || numList.size() == 0){
            return null;
        }
        if(size == 1){
            return numList;
        }

        Collections.sort(numList);
        Integer min = numList.get(0);
        Integer max = numList.get(size - 1);

        List<Integer> valueList = new ArrayList<>();
        valueList.add(min);
        for (int i = min; i < max; i++){
            min++;
            valueList.add(min);
        }
        return valueList;
    }
}
