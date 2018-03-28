import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by edz on 2018/3/13.
 */
public class Test {

    public static void main(String[] args) {
        /*String[] table = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9"};

        List<String> list = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {

            }
        }


        long n = 10;
        long m = 5;
        long x = n;
        long count = 0;
        for (int i = 0; i < m; i++) {
            x = x * x;
            count += x;
        }
        System.out.println(count);


        int t = 0;  //保存数字个数
        int[] var = {2, 5, 7, 9};
        for (int i = 0; i < var.length; i++) {
            for (int j = 0; j < var.length; j++) {
                for (int k = 0; k < var.length; k++) {
                    if (var[i] != var[j] && var[j] != var[k] && var[i] != var[k]) {
                        t += 1;
                        System.out.println(var[i] * 100 + var[j] * 10 + var[k]);
                    }
                }
            }
        }
        System.out.println(t);*/

        int[] nums = {7, 5, 9};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] < nums[j]){ // 如果从小到大则这里是大于号
                    int s = nums[i];
                    nums[i] = nums[j];
                    nums[j] = s;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        String str = dateFormat.format(now);
        try {
            now = dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
