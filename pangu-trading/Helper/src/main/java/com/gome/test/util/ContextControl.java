package com.gome.test.util;

import com.gome.framework.base.ResultDTO;
import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.cart.client.ShoppingCartClient;
import junit.framework.Assert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by weijianxing on 2016/12/8.
 */

@Component
public class ContextControl {

    @Resource
    ShoppingCartClient shoppingCartClient;
    public void cleanCart(User user , String site){
        String txid = BaseUtil.getTxId();
        ResultDTO<Boolean> resultDTO = shoppingCartClient.clearCart(user, txid, site);
        if(resultDTO == null){
            Assert.fail("teardown clean cart fail.");
        }
        Assert.assertTrue("clean cart response fail." , resultDTO.getData() );
    }
}
