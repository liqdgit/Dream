package chain;

import chain.body.Request;
import chain.body.Result;

/**
 * Created by meicai on 2018/8/14.
 */
public interface Chain {

    Request request();

    Result proceed(Request request);
}
