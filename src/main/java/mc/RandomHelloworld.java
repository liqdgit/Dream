package mc;

import java.util.*;

/**
 * Created by meicai on 2019/11/28.
 */
public class RandomHelloworld {
    public static void main(String[] args) {
        WeightObj a = new WeightObj("a", 10);
        WeightObj b = new WeightObj("b", 20);
        WeightObj c = new WeightObj("c", 30);
        WeightObj d = new WeightObj("d", 40);
        List list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        for(int i =0;i<100;i++){
            WeightObj weightObj = randomKey(list);
            System.out.println(weightObj.getName());
        }
    }

    public static WeightObj randomKey(List<WeightObj> list) {
        //按照权重排序
        Collections.sort(list, new Comparator<WeightObj>() {
            @Override
            public int compare(WeightObj o1, WeightObj o2) {
                if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                } else if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                }
                return 0;
            }
        });
        int sum = 0;
        for (WeightObj object : list) {
            sum += object.getWeight();
        }
        Random random = new Random();
        int randomNumber = random.nextInt(sum);
        WeightObj target = null;
        for (WeightObj object : list) {
            randomNumber -= object.getWeight();
            if (randomNumber <= 0) {
                target = object;
                break;
            }
        }
        return target;
    }

}
