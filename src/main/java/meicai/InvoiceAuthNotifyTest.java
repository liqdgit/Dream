package meicai;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by meicai on 2019/4/9.
 */
public class InvoiceAuthNotifyTest {

    public static void main(String[] args) {
        String fyCompanyKey = "c3c7199a-2669-4192-ae64-cd89fd01a186";
        Map<String, Object> params = Maps.newLinkedHashMap();
        params.put("invoiceId", "c3cbca82a8d0442b9dcfbaef52bf3866");
        params.put("status", "1");
        params.put("timestamp", "12451234123512");
        params.put("remark", "认证成功");
        params.put("sign", signParam(params, fyCompanyKey));
        System.out.println(JSONObject.toJSONString(params));
    }

    public static String signParam(Map<String, Object> map, String companyKey) {
        String content = "mc%" + FormatHttpParams(map) + "&company_secret=" + companyKey;
        String md5 = "";
        try {
            md5 = MD5(content).toUpperCase();
        } catch (Exception ex) {
        }
        return md5;
    }

    public static String FormatHttpParams(Map<String, Object> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = params.get(key);
            if (value==null || value.toString().trim().equals("")) {
                continue;
            }
            if (!prestr.equals("")) {
                prestr += "&";
            }
            prestr += key + "=" + value;
        }
        return prestr;
    }

    public static String MD5(String inStr) throws UnsupportedEncodingException {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(inStr.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
            System.exit(-1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] byteArray = md5.digest();

        StringBuffer md5StrBuff = new StringBuffer();

        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
        }
        return String.valueOf(md5StrBuff);
    }
}
