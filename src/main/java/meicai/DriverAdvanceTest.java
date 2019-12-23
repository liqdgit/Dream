package meicai;

import com.google.common.collect.Maps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Random;

/**
 * Created by meicai on 2018/7/11.
 */
public class DriverAdvanceTest {

    public static void main(String[] args) throws ParseException {
        sql();
    }

    public static void sql() throws ParseException {
        Map<String, String> userSourceMap = Maps.newTreeMap();
        userSourceMap.put("10020002", "自营");
        userSourceMap.put("10020003", "合作");
        userSourceMap.put("10020004", "第三方");
        userSourceMap.put("10020005", "合伙人自有");
        userSourceMap.put("10020006", "合伙人外包");
        userSourceMap.put("10020007", "合伙人渠道");
        userSourceMap.put("10020008", "劳务外包");

        Map<String, String> monthMap = Maps.newTreeMap();
//        monthMap.put("201902", "28");
//        monthMap.put("201903", "31");
//        monthMap.put("201903", "31");
//        monthMap.put("201904", "30");
//        monthMap.put("201905", "31");
//        monthMap.put("201906", "30");
//        monthMap.put("201907", "31");
//        monthMap.put("201908", "31");
//        monthMap.put("201909", "30");
//        monthMap.put("201910", "31");
//        monthMap.put("201911", "30");
        monthMap.put("201912", "15");

        Map<String, String> warehouseMap = Maps.newTreeMap();
        warehouseMap.put("10", "武汉仓库1");
//        warehouseMap.put("45", "北京5仓");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Random random = new Random();
        for (String month : monthMap.keySet()) {
            Integer days = Integer.parseInt(monthMap.get(month));
            for (int i = 1; i <= days; i++) {
                String delivery_time;
                if (i < 10) {
                    delivery_time = dateFormat.parse(month + "0" + i).getTime() / 1000 + "";
                } else {
                    delivery_time = dateFormat.parse(month + i).getTime() / 1000 + "";
                }
                for (String warehouseId : warehouseMap.keySet()) {
                    String warehouseName = warehouseMap.get(warehouseId);
                    for (String userSource : userSourceMap.keySet()) {
                        String userSourceName = userSourceMap.get(userSource);
                        String id = String.format("ess_test_%s_%s_%s_%s", userSource, warehouseId, month, i);
                        String user_source = userSource;
                        String user_source_name = userSourceName;
                        String warehouse_id = warehouseId;
                        String warehouse_name = warehouseName;
                        String biz_type = "1";
                        String money = random.nextInt(10000000) + "";
                        String c_t = "1543391125";
                        String sql = String.format("INSERT INTO `fi_etl`.`t_fi_ecs_freight_fee`" +
                                        " (`id`, `delivery_time`, `user_source`, `user_source_name`, `warehouse_id`, `warehouse_name`," +
                                        " `biz_type`, `money`, `c_t`) " +
                                        "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s');",
                                id,
                                delivery_time,
                                user_source,
                                user_source_name,
                                warehouse_id,
                                warehouse_name,
                                biz_type,
                                money,
                                c_t);
//                        contentToTxt("E:\\SQL-inert.txt", sql);
                    }
                }
                contentToTxt("E:\\SQL-inert.txt", delivery_time+",");
            }
        }

    }

    public static void contentToTxt(String filePath, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath), true));
            writer.write(content + "\r\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
