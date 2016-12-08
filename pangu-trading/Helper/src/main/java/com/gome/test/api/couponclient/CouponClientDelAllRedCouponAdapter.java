package com.gome.test.api.couponclient;

import java.util.Map;
import javax.annotation.Resource;
import com.gome.test.utils.*;
import com.gome.test.api.adapter.IAdapter;
import com.gome.test.api.adapter.IConvert;
import com.gome.pangu.trading.coupon.client.CouponClient;


public class CouponClientDelAllRedCouponAdapter extends IAdapter<CouponClient> implements IConvert{

    @Resource
    CouponClient couponClient;

    @Override
    public Object adapter(Map<String, String> map) {
            Map<String,Object>  objMap = convertMap(map);
           ////TODO
           return null;
    }

    @Override
    public void beforeClass() {

    }

    @Override
    public void beforeMethod() {

    }

    @Override
    public void afterClass() {

    }

    @Override
    public void afterMethod() {

    }

    public Map<String, Object> convertMap(Map<String, String> map) {
        return ConvertUtils.convertToHasMap(map);
    }
}

