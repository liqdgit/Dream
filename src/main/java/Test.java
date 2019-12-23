import com.alibaba.fastjson.JSONObject;

/**
 * Created by meicai on 2018/12/26.
 */
public class Test {

    public static void main(String[] args) {
        String[] strs = "t_fi_ar_line set non_tax_money=15413, tax_rate=0.09, tax_money=1387, u_t=unix_timestamp() where id=951261861;t_fi_ar_line set non_tax_money=29735, tax_rate=0.13, tax_money=3865, u_t=unix_timestamp() where id=951068823;t_fi_ar_line set non_tax_money=27434, tax_rate=0.13, tax_money=3566, u_t=unix_timestamp() where id=951068820;t_fi_ar_line set non_tax_money=14867, tax_rate=0.13, tax_money=1933, u_t=unix_timestamp() where id=952619973;t_fi_ar_line set non_tax_money=15413, tax_rate=0.09, tax_money=1387, u_t=unix_timestamp() where id=952619979;t_fi_ar_line set non_tax_money=27434, tax_rate=0.13, tax_money=3566, u_t=unix_timestamp() where id=952582206;t_fi_ar_line set non_tax_money=27434, tax_rate=0.13, tax_money=3566, u_t=unix_timestamp() where id=952644180".split(";");

        for (String str: strs) {
            System.out.println("{sql: \""+str+"\", fix:1},");
        }
    }


}
