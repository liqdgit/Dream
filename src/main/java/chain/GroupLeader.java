package chain;

import chain.body.Request;
import chain.body.Result;

/**
 * Created by meicai on 2018/8/14.
 */
public class GroupLeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("GroupLeader=====>request:" + request.toString());

        if (true) {
            return chain.proceed(new Request());
        }

        return new Result();

    }
}
