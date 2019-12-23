package test.threadlocal;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by meicai on 2018/9/21.
 */
public class Test {

    public static void main(String[] args) {
        Runnable run1 = () -> {
            LocalUtil.threadLocal.set(1);
            for (int i = 0; i < 10; i++) {
                Integer num = LocalUtil.threadLocal.get();
                num++;
                LocalUtil.threadLocal.set(num);
                System.out.println(LocalUtil.threadLocal.get());
            }
        };

        Runnable run2 = () -> {
            LocalUtil.threadLocal.set(1);
            for (int i = 0; i < 10; i++) {
                Integer num = LocalUtil.threadLocal.get();
                num++;
                LocalUtil.threadLocal.set(num);
                System.out.println(LocalUtil.threadLocal.get());
            }
        };
        Runnable run3 = () -> {
            LocalUtil.threadLocal.set(1);
            for (int i = 0; i < 10; i++) {
                Integer num = LocalUtil.threadLocal.get();
                num++;
                LocalUtil.threadLocal.set(num);
                System.out.println(LocalUtil.threadLocal.get());
            }

        };

        Runnable run4 = () -> {
            LocalUtil.threadLocal.set(1);
            for (int i = 0; i < 10; i++) {
                Integer num = LocalUtil.threadLocal.get();
                num++;
                LocalUtil.threadLocal.set(num);
                System.out.println(LocalUtil.threadLocal.get());
            }
        };

        new Thread(run1).start();
        new Thread(run2).start();
        new Thread(run3).start();
        new Thread(run4).start();

        List<String> list = Lists.newArrayList();
        List<String> list1 = Lists.newArrayList();
        list.addAll(list1);
    }
}
