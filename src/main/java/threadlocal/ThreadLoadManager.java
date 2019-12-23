package threadlocal;

/**
 * Created by meicai on 2019/1/17.
 */
public class ThreadLoadManager {

    private static final ThreadLocal<Object> threadLoad = new ThreadLocal<>();

    public void before(int i){
        threadLoad.set(i);
    }

    public int after(){
        System.out.println(threadLoad.get());
        return (int) threadLoad.get();
    }
}
