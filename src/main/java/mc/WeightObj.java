package mc;

/**
 * Created by meicai on 2019/11/28.
 */
public class WeightObj {

    private String name;
    private int weight;

    public WeightObj(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
