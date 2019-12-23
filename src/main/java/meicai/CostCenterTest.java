package meicai;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by meicai on 2018/11/30.
 */
public class CostCenterTest {

    public static void main(String[] args) {
        String json = "[\n" +
                "{\"部门编码\":\"1001A110000000145QLG\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4012\",\"cost_center_name\":\"金华质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QZ8\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5512\",\"cost_center_name\":\"深圳西城质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QZG\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5412\",\"cost_center_name\":\"深圳东城质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QNI\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5112\",\"cost_center_name\":\"杭州北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QM6\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2210\",\"cost_center_name\":\"宁波质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QMU\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4513\",\"cost_center_name\":\"绍兴质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QMM\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4413\",\"cost_center_name\":\"泉州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QNA\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5012\",\"cost_center_name\":\"杭州南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QNQ\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1126\",\"cost_center_name\":\"江北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QN2\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4613\",\"cost_center_name\":\"台州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QNY\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1119\",\"cost_center_name\":\"江南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QLY\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2911\",\"cost_center_name\":\"厦门质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QLQ\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2814\",\"cost_center_name\":\"福州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QME\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0710\",\"cost_center_name\":\"温州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QO6\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3612\",\"cost_center_name\":\"徐州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QOM\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0410\",\"cost_center_name\":\"合肥质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QOE\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1410\",\"cost_center_name\":\"无锡质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QOU\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1010\",\"cost_center_name\":\"常州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QPI\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4813\",\"cost_center_name\":\"泰州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QPX\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5212\",\"cost_center_name\":\"苏州南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QQD\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1210\",\"cost_center_name\":\"成都质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QQ5\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5312\",\"cost_center_name\":\"苏州北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QQL\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2110\",\"cost_center_name\":\"重庆质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QQT\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1910\",\"cost_center_name\":\"西安质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QR1\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2613\",\"cost_center_name\":\"贵阳质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QRP\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B6112\",\"cost_center_name\":\"兰州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QRH\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3412\",\"cost_center_name\":\"昆明质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QR9\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3212\",\"cost_center_name\":\"绵阳质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QRX\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3512\",\"cost_center_name\":\"衡阳质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QSD\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3312\",\"cost_center_name\":\"南昌质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QS5\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3712\",\"cost_center_name\":\"赣州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QST\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5712\",\"cost_center_name\":\"武汉南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QSL\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2010\",\"cost_center_name\":\"长沙质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QT1\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5612\",\"cost_center_name\":\"武汉北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QTH\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0210\",\"cost_center_name\":\"天津质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QT9\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3912\",\"cost_center_name\":\"潍坊质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QTP\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3112\",\"cost_center_name\":\"石家庄质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QTX\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0910\",\"cost_center_name\":\"郑州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QUD\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0610\",\"cost_center_name\":\"青岛质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QU5\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B0510\",\"cost_center_name\":\"济南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QUL\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4114\",\"cost_center_name\":\"太原质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QV8\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B2714\",\"cost_center_name\":\"大连质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QVG\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3012\",\"cost_center_name\":\"沈阳质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QVO\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4713\",\"cost_center_name\":\"长春质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QVW\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5912\",\"cost_center_name\":\"呼和浩特质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QW4\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B6012\",\"cost_center_name\":\"哈尔滨质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QWC\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1027\",\"cost_center_name\":\"京东北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QWS\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B25106\",\"cost_center_name\":\"京西北质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QWK\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1028\",\"cost_center_name\":\"京西南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QX8\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1532\",\"cost_center_name\":\"浦西质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QX0\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1531\",\"cost_center_name\":\"浦东质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QXG\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1530\",\"cost_center_name\":\"沪南质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QXO\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B5812\",\"cost_center_name\":\"沪嘉质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QXW\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B3812\",\"cost_center_name\":\"南宁质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QY4\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1710\",\"cost_center_name\":\"广州质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QYC\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B1610\",\"cost_center_name\":\"东莞质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QYS\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4211\",\"cost_center_name\":\"中山质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QYK\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"F0314\",\"cost_center_name\":\"佛山质量管理部\"},\n" +
                "{\"部门编码\":\"1001A110000000145QZ0\",\"c4_name\":\"供应链运营部\",\"cost_center_code\":\"B4313\",\"cost_center_name\":\"惠州质量管理部\"}\n" +
                "]";
//        createCostCenter(json);
        updateDept(json);
        String str = "{\"costCenterCode\":\"B4012\",\"deptId\":\"1001A110000000145QLG\",\"costCenterName\":\"金华质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5512\",\"deptId\":\"1001A110000000145QZ8\",\"costCenterName\":\"深圳西城质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5412\",\"deptId\":\"1001A110000000145QZG\",\"costCenterName\":\"深圳东城质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5112\",\"deptId\":\"1001A110000000145QNI\",\"costCenterName\":\"杭州北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2210\",\"deptId\":\"1001A110000000145QM6\",\"costCenterName\":\"宁波质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4513\",\"deptId\":\"1001A110000000145QMU\",\"costCenterName\":\"绍兴质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4413\",\"deptId\":\"1001A110000000145QMM\",\"costCenterName\":\"泉州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5012\",\"deptId\":\"1001A110000000145QNA\",\"costCenterName\":\"杭州南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1126\",\"deptId\":\"1001A110000000145QNQ\",\"costCenterName\":\"江北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4613\",\"deptId\":\"1001A110000000145QN2\",\"costCenterName\":\"台州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1119\",\"deptId\":\"1001A110000000145QNY\",\"costCenterName\":\"江南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2911\",\"deptId\":\"1001A110000000145QLY\",\"costCenterName\":\"厦门质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2814\",\"deptId\":\"1001A110000000145QLQ\",\"costCenterName\":\"福州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0710\",\"deptId\":\"1001A110000000145QME\",\"costCenterName\":\"温州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3612\",\"deptId\":\"1001A110000000145QO6\",\"costCenterName\":\"徐州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0410\",\"deptId\":\"1001A110000000145QOM\",\"costCenterName\":\"合肥质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1410\",\"deptId\":\"1001A110000000145QOE\",\"costCenterName\":\"无锡质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1010\",\"deptId\":\"1001A110000000145QOU\",\"costCenterName\":\"常州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4813\",\"deptId\":\"1001A110000000145QPI\",\"costCenterName\":\"泰州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5212\",\"deptId\":\"1001A110000000145QPX\",\"costCenterName\":\"苏州南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1210\",\"deptId\":\"1001A110000000145QQD\",\"costCenterName\":\"成都质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5312\",\"deptId\":\"1001A110000000145QQ5\",\"costCenterName\":\"苏州北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2110\",\"deptId\":\"1001A110000000145QQL\",\"costCenterName\":\"重庆质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1910\",\"deptId\":\"1001A110000000145QQT\",\"costCenterName\":\"西安质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2613\",\"deptId\":\"1001A110000000145QR1\",\"costCenterName\":\"贵阳质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B6112\",\"deptId\":\"1001A110000000145QRP\",\"costCenterName\":\"兰州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3412\",\"deptId\":\"1001A110000000145QRH\",\"costCenterName\":\"昆明质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3212\",\"deptId\":\"1001A110000000145QR9\",\"costCenterName\":\"绵阳质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3512\",\"deptId\":\"1001A110000000145QRX\",\"costCenterName\":\"衡阳质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3312\",\"deptId\":\"1001A110000000145QSD\",\"costCenterName\":\"南昌质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3712\",\"deptId\":\"1001A110000000145QS5\",\"costCenterName\":\"赣州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5712\",\"deptId\":\"1001A110000000145QST\",\"costCenterName\":\"武汉南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2010\",\"deptId\":\"1001A110000000145QSL\",\"costCenterName\":\"长沙质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5612\",\"deptId\":\"1001A110000000145QT1\",\"costCenterName\":\"武汉北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0210\",\"deptId\":\"1001A110000000145QTH\",\"costCenterName\":\"天津质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3912\",\"deptId\":\"1001A110000000145QT9\",\"costCenterName\":\"潍坊质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3112\",\"deptId\":\"1001A110000000145QTP\",\"costCenterName\":\"石家庄质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0910\",\"deptId\":\"1001A110000000145QTX\",\"costCenterName\":\"郑州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0610\",\"deptId\":\"1001A110000000145QUD\",\"costCenterName\":\"青岛质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B0510\",\"deptId\":\"1001A110000000145QU5\",\"costCenterName\":\"济南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4114\",\"deptId\":\"1001A110000000145QUL\",\"costCenterName\":\"太原质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B2714\",\"deptId\":\"1001A110000000145QV8\",\"costCenterName\":\"大连质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3012\",\"deptId\":\"1001A110000000145QVG\",\"costCenterName\":\"沈阳质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4713\",\"deptId\":\"1001A110000000145QVO\",\"costCenterName\":\"长春质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5912\",\"deptId\":\"1001A110000000145QVW\",\"costCenterName\":\"呼和浩特质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B6012\",\"deptId\":\"1001A110000000145QW4\",\"costCenterName\":\"哈尔滨质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1027\",\"deptId\":\"1001A110000000145QWC\",\"costCenterName\":\"京东北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B25106\",\"deptId\":\"1001A110000000145QWS\",\"costCenterName\":\"京西北质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1028\",\"deptId\":\"1001A110000000145QWK\",\"costCenterName\":\"京西南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1532\",\"deptId\":\"1001A110000000145QX8\",\"costCenterName\":\"浦西质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1531\",\"deptId\":\"1001A110000000145QX0\",\"costCenterName\":\"浦东质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1530\",\"deptId\":\"1001A110000000145QXG\",\"costCenterName\":\"沪南质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B5812\",\"deptId\":\"1001A110000000145QXO\",\"costCenterName\":\"沪嘉质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B3812\",\"deptId\":\"1001A110000000145QXW\",\"costCenterName\":\"南宁质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1710\",\"deptId\":\"1001A110000000145QY4\",\"costCenterName\":\"广州质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B1610\",\"deptId\":\"1001A110000000145QYC\",\"costCenterName\":\"东莞质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4211\",\"deptId\":\"1001A110000000145QYS\",\"costCenterName\":\"中山质量管理部\"}|\n" +
                "{\"costCenterCode\":\"F0314\",\"deptId\":\"1001A110000000145QYK\",\"costCenterName\":\"佛山质量管理部\"}|\n" +
                "{\"costCenterCode\":\"B4313\",\"deptId\":\"1001A110000000145QZ0\",\"costCenterName\":\"惠州质量管理部\"}";
//        updateSupplierBankNo();
    }

    public static void createCostCenter(String json){
        JSONArray jsonArray = JSON.parseArray(json);
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            Map<String, String> map = Maps.newHashMap();
            map.put("code", jsonObject.getString("成本中心编码"));
            map.put("name", jsonObject.getString("成本中心名称"));
            map.put("parent", jsonObject.getString("上级成本中心编码"));
            map.put("fiOrgCode", jsonObject.getString("费用承担公司编码"));
            map.put("deptDirector", jsonObject.getString("部门主管编码"));
            map.put("fiDirector", jsonObject.getString("财务主管编码"));
            map.put("costAttache", jsonObject.getString("费用专员编码"));
            map.put("paymentAttache", jsonObject.getString("薪酬专员编码"));
            map.put("businessManager", jsonObject.getString("业务线负责人编码"));
            map.put("budgetAttache", jsonObject.getString("预算专员编码"));
            String deptProperty = jsonObject.getString("部门属性");
            if (deptProperty.equals("销售")) {
                map.put("deptProperty", "1");
            }
            if (deptProperty.equals("管理")) {
                map.put("deptProperty", "2");
            }
            if (deptProperty.equals("仓储")) {
                map.put("deptProperty", "3");
            }
            if (deptProperty.equals("配送")) {
                map.put("deptProperty", "4");
            }
            if (deptProperty.equals("研发")) {
                map.put("deptProperty", "5");
            }

            System.out.println(JSONObject.toJSONString(map) + "|");
        }
    }

    public static void updateDept(String json){
        JSONArray jsonArray = JSON.parseArray(json);
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            Map<String, String> map = Maps.newHashMap();
            map.put("deptId", jsonObject.getString("部门编码"));
            map.put("costCenterCode", jsonObject.getString("cost_center_code"));
            map.put("costCenterName", jsonObject.getString("cost_center_name"));

            System.out.println(JSONObject.toJSONString(map) + "|");
        }
    }

    public static void updateSupplierBankNo(){
        String json = "[\n" +
                "{\"id\":\"9329\",\"name\":\"三明福圆贸易有限公司\",\"bankNo\":\"102395060134\"},\n" +
                "{\"id\":\"16140\",\"name\":\"凌河区胖姐食品经销处\",\"bankNo\":\"313227000158\"},\n" +
                "{\"id\":\"7269\",\"name\":\"北京亿鑫恒业粮油贸易有限公司\",\"bankNo\":\"402100000464\"},\n" +
                "{\"id\":\"16128\",\"name\":\"北京四方方园粮油有限公司\",\"bankNo\":\"104100005274\"},\n" +
                "{\"id\":\"7705\",\"name\":\"北京市奥顺兴时代商贸有限责任公司\",\"bankNo\":\"103100012011\"},\n" +
                "{\"id\":\"7277\",\"name\":\"北京汇兴福盛商贸有限公司\",\"bankNo\":\"105100018050\"},\n" +
                "{\"id\":\"7713\",\"name\":\"北京鑫银顺贸易有限公司\",\"bankNo\":\"313100000208\"},\n" +
                "{\"id\":\"17024\",\"name\":\"十堰和元捷实业发展有限公司\",\"bankNo\":\"103523023923\"},\n" +
                "{\"id\":\"14248\",\"name\":\"南京慈嘉农业科技有限公司\",\"bankNo\":\"105301001090\"},\n" +
                "{\"id\":\"10989\",\"name\":\"南宁市五丰工贸有限公司\",\"bankNo\":\"313611015041\"},\n" +
                "{\"id\":\"13384\",\"name\":\"南平市建阳区餐友粮油商行\",\"bankNo\":\"403401400027\"},\n" +
                "{\"id\":\"9325\",\"name\":\"厦门创钰商贸有限公司\",\"bankNo\":\"105393000097\"},\n" +
                "{\"id\":\"10089\",\"name\":\"厦门市信孚米业有限公司\",\"bankNo\":\"305393000010\"},\n" +
                "{\"id\":\"9317\",\"name\":\"厦门鑫禾兴粮油贸易有限公司\",\"bankNo\":\"102393000702\"},\n" +
                "{\"id\":\"12076\",\"name\":\"呼和浩特市昕百隆商贸有限公司\",\"bankNo\":\"105191066252\"},\n" +
                "{\"id\":\"16144\",\"name\":\"唐山市龙兴酒店用品有限公司\",\"bankNo\":\"301124001049\"},\n" +
                "{\"id\":\"9333\",\"name\":\"宁德市丰登粮油贸易有限公司\",\"bankNo\":\"409158374420\"},\n" +
                "{\"id\":\"17020\",\"name\":\"广西柳州市东聚商贸有限公司\",\"bankNo\":\"102614040403\"},\n" +
                "{\"id\":\"15236\",\"name\":\"征腾云商购（北京）供应链管理有限公司\",\"bankNo\":\"103100010152\"},\n" +
                "{\"id\":\"12084\",\"name\":\"忻州晋龙粮油贸易有限公司\",\"bankNo\":\"103171067904\"},\n" +
                "{\"id\":\"9297\",\"name\":\"成都鹏鑫宏商贸有限公司\",\"bankNo\":\"305651000245\"},\n" +
                "{\"id\":\"14244\",\"name\":\"抚顺市顺城区多福家粮油经销处\",\"bankNo\":\"10322403011\"},\n" +
                "{\"id\":\"11053\",\"name\":\"沈阳北一新宏达粮油有限公司\",\"bankNo\":\"103221014041\"},\n" +
                "{\"id\":\"10117\",\"name\":\"沈阳市众顺泰商贸有限公司\",\"bankNo\":\"102221000809\"},\n" +
                "{\"id\":\"9405\",\"name\":\"河南油溢千家商贸有限公司\",\"bankNo\":\"102498002013\"},\n" +
                "{\"id\":\"10097\",\"name\":\"泉州市正泰米业有限公司\",\"bankNo\":\"305397023161\"},\n" +
                "{\"id\":\"15348\",\"name\":\"泊头市鑫福商贸有限公司\",\"bankNo\":\"313144105326\"},\n" +
                "{\"id\":\"17060\",\"name\":\"泰州市盐业有限公司\",\"bankNo\":\"102312802046\"},\n" +
                "{\"id\":\"17028\",\"name\":\"湖南格林山油茶科技有限公司\",\"bankNo\":\"105551005212\"},\n" +
                "{\"id\":\"9313\",\"name\":\"漳州市龙文区亚缎副食品经营部\",\"bankNo\":\"314399081443\"},\n" +
                "{\"id\":\"16132\",\"name\":\"石家庄合益荣商贸有限公司\",\"bankNo\":\"103121034880\"},\n" +
                "{\"id\":\"16148\",\"name\":\"福州快乐邦贸易有限公司\",\"bankNo\":\"103391015207\"},\n" +
                "{\"id\":\"15240\",\"name\":\"福州正德诚贸易有限公司\",\"bankNo\":\"308391026204\"},\n" +
                "{\"id\":\"10909\",\"name\":\"莆田市荔城区诚豪贸易有限公司\",\"bankNo\":\"104394023022\"},\n" +
                "{\"id\":\"8473\",\"name\":\"衡水市桃城区佳盛副食销售中心\",\"bankNo\":\"305148048019\"},\n" +
                "{\"id\":\"9289\",\"name\":\"遂宁市同创商贸有限公司\",\"bankNo\":\"103662032002\"},\n" +
                "{\"id\":\"12060\",\"name\":\"邢台粮旺商贸有限公司\",\"bankNo\":\"103131020402\"},\n" +
                "{\"id\":\"17012\",\"name\":\"防城港市港口区金峰商贸有限公司\",\"bankNo\":\"105633000017\"},\n" +
                "{\"id\":\"11856\",\"name\":\"鞍山宏业恒大商贸有限公司\",\"bankNo\":\"301223004400 \"}\n" +
                "]";
        JSONArray jsonArray = JSON.parseArray(json);
        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println(JSONObject.toJSONString(jsonObject) + "|");
        }
    }
}
