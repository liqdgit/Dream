package threadlocal;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * Created by meicai on 2019/1/17.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i < 10000; i++) {
            final int num = i;
            new Runnable() {
                @Override
                public void run() {
                    ThreadLoadManager manager = new ThreadLoadManager();
                    manager.before(num);
//                    try {
//                        Thread.sleep(random.nextInt(100));
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    list.add(manager.after());
                }
            }.run();
        }
        System.out.println(list.size());
    }
}
