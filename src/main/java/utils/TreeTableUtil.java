package utils;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/**
 * <p>title:      TreeTableUtil. </p>
 * <p>description 树形表格 </p>
 * <p>company:    http://www.meicai.cn </p>
 *
 * @author <a href="liqingdong@meicai.cn"/>李清栋</a>
 * @createDate 2018/5/23 15:03
 */
public class TreeTableUtil {

    /**
     * @desc: 递归生成树结构
     * @author <a href="liqingdong@meicai.cn"/>李清栋</a>
     * @createDate 2018/5/28 10:24
     */
    public static <T extends TreeTableModel> List<T> treeData(List<T> list, String pid) {
        List<T> resultList = Lists.newArrayList();
        if (list != null && list.size() > 0) {
            List<T> tempList;
            for (T tree : list) {
                if (tree.getPid() == pid || tree.getPid().equals(pid)) {
                    resultList.add(tree);
                    tempList = treeData(list, tree.getId());
                    if (tempList != null && tempList.size() > 0) {
                        tree.setChild(tempList);
                    }
                }
            }
        }
        return resultList;
    }

    /**
     * @desc: 根据树结构递归获取排序
     * @author <a href="liqingdong@meicai.cn"/>李清栋</a>
     * @createDate 2018/5/28 10:24
     */
    public static <T extends TreeTableModel> List<T> treeSort(T tree) {
        List<T> resultList = Lists.newArrayList();
        List<T> childList = tree.getChild();
        for (T item : childList) {
            resultList.add(item);
            if (item.getChild() != null) {
                List<T> c = treeSort(item);
                if (c.size() > 0) {
                    resultList.addAll(c);
                }
            }
        }
        return resultList;

    }

    public static <T extends TreeTableModel> List<T> getTreeTableData(List<T> list, String pid, boolean not) {
        List<T> treeList = treeData(list, pid);
        List<T> resultList = Lists.newArrayList();
        for (T tree : treeList) {
            resultList.add(tree);
            if (tree.getChild() != null) {
                resultList.addAll(treeSort(tree));
            }
        }
        for (T tree : resultList) {
            tree.setChild(null);
        }

        // 检查树结构是否有错误的
        if (list.size() != resultList.size()) {
            try {
                Map<String, T> map = Maps.newHashMap();
                for (T tree : list) {
                    map.put(tree.getId(), tree);
                }
                for (T tree : resultList) {
                    map.remove(tree.getId());
                }
                if (map.size() > 0 && not) {
                    resultList.addAll(map.values());
                }
                System.out.println("树结构存在错误节点：" + JSONObject.toJSONString(map));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return resultList;
    }

    public static void main(String[] args) throws Exception {
        String str = "";
        File file = new File("C:\\Users\\meicai\\Desktop\\dept.txt");
        if (file.isFile() && file.exists()) { // 判断文件是否存在
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), "utf-8");// 编码格式必须和文件的一致
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                str += lineTxt;
            }
            read.close();
        } else {
            System.out.println("指定的文件不存在");
        }
        JSONArray jsonArray = JSONArray.parseArray(str);
        for (Object object : jsonArray) {
            JSONObject jsonObject = (JSONObject) object;
            String pid = jsonObject.getString("parent");
            if (pid == null) {
                System.out.println(jsonObject.getString("id"));
            }
            jsonObject.put("pid", pid);
        }
        List<DeptTreeTable> list = JSONArray.parseArray(jsonArray.toJSONString(), DeptTreeTable.class);
        getTreeTableData(list, "#", false);
    }
}
