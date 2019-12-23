package test;


import com.google.common.collect.Sets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by meicai on 2018/7/30.
 */
public class BetaTest {

    public static Set readTxtFile(String filePath, String encoding) {
        Set set = null;
        try {
            String str = "";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);// 编码格式必须和文件的一致
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    str += lineTxt;
                }
                read.close();
            } else {
                System.out.println("指定的文件不存在");
            }
            set = Sets.newHashSet(str.split(","));
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> relation = readTxtFile("C:\\Users\\meicai\\Desktop\\relation.txt","utf-8");
        Set<Integer> docId = readTxtFile("C:\\Users\\meicai\\Desktop\\doc.txt", "utf-8");
        Iterator relationI = relation.iterator();

        while (relationI.hasNext()){
            Object rec = relationI.next();
            docId.remove(rec);
        }
        Iterator docI = docId.iterator();
        while (docI.hasNext()){
            Object rec = docI.next();
            System.out.println(rec);
        }
    }

    public static void set(Boolean is){
        is = true;
    }
}
