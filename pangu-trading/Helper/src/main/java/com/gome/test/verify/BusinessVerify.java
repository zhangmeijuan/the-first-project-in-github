package com.gome.test.verify;

import com.gome.framework.base.ResultDTO;
import com.gome.pangu.trading.bo.CommerceItem;
import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.cart.client.ShoppingCartClient;
import com.gome.pangu.trading.cart.client.ShoppingCartQueryClient;
import com.gome.pangu.trading.cart.client.dto.param.AddItemToCartParam;
import com.gome.pangu.trading.cart.client.dto.param.QueryCartParam;
import com.gome.pangu.trading.cart.client.dto.result.CartInfoResult;
import com.gome.pangu.trading.cart.client.dto.result.GroupedCartInfo;
import com.gome.test.util.BaseUtil;
import com.gome.test.util.ContextControl;
import com.gome.test.util.TestResultDO;
import junit.framework.Assert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by weijianxing on 2016/12/7.
 */

@Component
public class BusinessVerify {

    @Resource
    ShoppingCartQueryClient shoppingCartQueryClient;
    @Resource
    ShoppingCartClient shoppingCartClient;
    @Resource
    ContextControl contextControl;

    /**
     *
     * @param response
     */
    public void verifyCartByAdd(TestResultDO response){
        Map<String , Object> requestParams  = response.getRequestMap();
        User user = (User)requestParams.get("user");
        String site = (String)requestParams.get("site");
        AddItemToCartParam requestParam = (AddItemToCartParam)requestParams.get("product");
        String txid = BaseUtil.getTxId();
        QueryCartParam queryCartParam = new QueryCartParam();
        queryCartParam.setUser(user);
        queryCartParam.setSiteId(site);
        queryCartParam.setOnlyChecked(false);
        ResultDTO<CartInfoResult> items = shoppingCartQueryClient.getCommerceItems(user , txid,site , queryCartParam);
        if(items == null){
            Assert.fail("shoppingCartQueryClient.getCommerceItems fail.");
        }
        verifyItems(user , site, requestParam , items , "verify  AddItemToCart");
    }

    public boolean verifyItems(User  user , String site,  AddItemToCartParam request , ResultDTO<CartInfoResult> response , String msg){
        CartInfoResult cartInfoResult = response.getData();
        if(cartInfoResult == null ){
            Assert.fail(msg + " verify fail.");
        }
        String pid = request.getProductId();
        String sid = request.getSkuId();
        Boolean findFlag = false;
        //todo compare pid with resposne.
        List<GroupedCartInfo> list = cartInfoResult.getGroupedCartInfoList();
        for(GroupedCartInfo info : list){
            List<CommerceItem> commerceItems= info.getCommerceItemsInShop();
            for(CommerceItem item : commerceItems){
                if(item.getProductId().equals(pid) && item.getSkuId().equals(sid)){
                    findFlag = true;
                }
            }
        }
        Assert.assertTrue(msg + " fail." , findFlag);
        //tear down recover  ENV.
       contextControl.cleanCart(user, site);
        return true;
    }

    /**
     * clean cart.
     * @param user
     * @param site
     */


}
