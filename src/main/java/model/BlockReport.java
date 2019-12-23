package model;

import java.util.List;

/**
 * Created by meicai on 2019/9/19.
 */
public class BlockReport<T extends BaseQuotaReport> {

    private String code;

    private String title;

    private List<T> quotaData;
}
