package mc;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by meicai on 2019/12/3.
 */
public class WeightRandom<K, V extends Number> {

    private TreeMap<Double, K> weightMap = new TreeMap<>();

    public WeightRandom(List<Pair<K, V>> list) {
        Preconditions.checkNotNull(list, "list can NOT be null!");
        for (Pair<K, V> pair : list) {
            double lastWeight = this.weightMap.size() == 0 ? 0 : this.weightMap.lastKey().doubleValue();
            this.weightMap.put(pair.getValue().doubleValue() + lastWeight, pair.getKey());
        }
    }

    public K random() {
        double randomWeight = this.weightMap.lastKey() * Math.random();
        SortedMap<Double, K> tailMap = this.weightMap.tailMap(randomWeight, false);
        return this.weightMap.get(tailMap.firstKey());
    }

    public static void main(String[] args) {
        List<Pair<String, Integer>> list = Lists.newArrayList();
        Pair<String, Integer> pair1 = Pair.of("a", 1);
        System.out.println(pair1.getKey() + ": " + pair1.getValue().doubleValue() / 10);
        Pair<String, Integer> pair2 = Pair.of("b", 3);
        System.out.println(pair2.getKey() + ": " + pair2.getValue().doubleValue() / 10);
        Pair<String, Integer> pair3 = Pair.of("c", 6);
        System.out.println(pair3.getKey() + ": " + pair3.getValue().doubleValue() / 10);
//        Pair<String, Integer> pair4 = Pair.of("d", 10);
//        System.out.println(pair4.getKey() + ": " + pair4.getValue().doubleValue() / 20);
        list.add(pair1);
        list.add(pair2);
        list.add(pair3);
//        list.add(pair4);
        WeightRandom<String, Integer> weightRandom = new WeightRandom<>(list);
        Map<String, Integer> countMap = Maps.newHashMap();
        int total = 1000000;
        for (int i = 0; i < total; i++) {
            String key = weightRandom.random();
            if (countMap.containsKey(key)) {
                countMap.put(key, countMap.get(key) + 1);
            } else {
                countMap.put(key, 1);
            }
        }
        for (String key : countMap.keySet()) {
            System.out.println(key + ":" + countMap.get(key) + "，命中率：" + countMap.get(key).doubleValue() / total);
        }
    }
}
