package meicai;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Random;

/**
 * Created by meicai on 2019/6/18.
 */
public class EssSettlementData {

    public static void main(String[] args) {
        String[] provinces = {"北京", "上海", "浙江", "广东", "天津", "重庆", "山西", "陕西"};
        String[] citys = {"北京市", "上海市", "浙江", "广州市", "天津市", "重庆市", "太原市", "西安市"};
        String[] banks = {"招商银行", "建设银行", "中国银行", "广发银行", "北京银行", "交通银行", "工商银行", "中国农业银行"};
        String[] branchs = {"西二旗支行", "回龙观支行", "上地支行", "五道口支行", "中关村支行", "安贞支行", "西直门支行", "东直门支行"};
        String[] persons = {"张三", "李四", "王麻子", "赵六", "关羽", "钟馗", "孙悟空", "李白"};

        Random random = new Random();

        JSONObject object = new JSONObject();
        object.put("beginDate", System.currentTimeMillis() / 1000);
        object.put("endDate", System.currentTimeMillis() / 1000);
        object.put("cityId", random.nextInt(8));
        object.put("fOrgFund", "01010101");
        object.put("period", "201906");
        object.put("remark", "支付北京20190601-20190331司机工资");
        object.put("sourceType", 10);
        object.put("warehouseId", 1);
        String sourceNo = "JSD201906018" + random.nextInt(99999);
        object.put("sourceNo", sourceNo);
        int totalNum = 1;
//        int totalNum = random.nextInt(25);
//        object.put("totalNum", totalNum);


        JSONArray jsonArray = new JSONArray();
        long totalMoney = 0;
        for (int i = 0; i < totalNum; i++) {
            JSONObject detail = new JSONObject();
            detail.put("detailNo", sourceNo + "-MX-" + (i + 1));
//            detail.put("payObjId", random.nextInt(99999999));
            detail.put("payObjId", "0001000449001");
//            String payObjName = persons[random.nextInt(8)];
            detail.put("payObjName", "小小杨");
//            detail.put("payObjName", payObjName);
            detail.put("toAccountCode", "6214562884556"+random.nextInt(99999999));
            detail.put("toAccountName", "小小杨");
            String bank = banks[random.nextInt(8)];
            String branch = bank+branchs[random.nextInt(8)];
            detail.put("toBankBranch", branch);
            detail.put("toBankCity", citys[random.nextInt(8)]);
            detail.put("toBankName", bank);
            detail.put("toBankNo", random.nextInt(99999999));
            detail.put("toBankProvince", provinces[random.nextInt(8)]);
            int money = random.nextInt(99999999);
            totalMoney += money;
            detail.put("payMoney", money);
            detail.put("userSource", "10020009");

            jsonArray.add(detail);
        }
        object.put("totalMoney", totalMoney);
        object.put("details", jsonArray);

        System.out.println(JSON.toJSONString(object));
    }
}
