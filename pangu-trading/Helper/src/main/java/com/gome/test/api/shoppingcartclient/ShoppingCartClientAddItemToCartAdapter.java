package com.gome.test.api.shoppingcartclient;

import java.util.Map;
import javax.annotation.Resource;

import com.gome.framework.base.ResultDTO;
import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.cart.client.dto.param.AddItemToCartParam;
import com.gome.test.context.ContextUtils;
import com.gome.test.mock.common.RequestMock;
import com.gome.test.util.BaseUtil;
import com.gome.test.util.ContextControl;
import com.gome.test.util.TestResultDO;
import com.gome.test.utils.*;
import com.gome.test.api.adapter.IAdapter;
import com.gome.test.api.adapter.IConvert;
import com.gome.pangu.trading.cart.client.ShoppingCartClient;


public class ShoppingCartClientAddItemToCartAdapter extends IAdapter<ShoppingCartClient> implements IConvert{

    @Resource
    ShoppingCartClient shoppingCartClient;

    @Resource
    RequestMock requestMock;

    @Resource
    ContextControl contextControl;


    @Override
    public Object adapter(Map<String, String> map) {
        Map<String,Object>  objMap = convertMap(map);
        String uid = objMap.get("userID").toString();
        String siteFlag = objMap.get("site").toString();
        //call static mocking class mock parameters of site.
        String site = requestMock.getSite(siteFlag);
        AddItemToCartParam itemToCartParam = null;
        User user = null;
        //call static mocking class mock parameters of user instance.
        if(uid.equals("logined")){
            user = requestMock.getValidateUser();
        }else if(uid.equals("invalidate")){
            user = requestMock.getInvalidateUser();
        }else if(uid.equals("none")){
            user = null;
        }

        itemToCartParam = requestMock.getRandomProduct();
        //call static mocking class mock parameters of itemToCartParam instance.

        int caseNo = BaseUtil.getCaseNumber();
        String txId = BaseUtil.getTxId();
        TestResultDO result = new TestResultDO();

        try {
            //keep ENV clean.
            contextControl.cleanCart(user , site);
            //call SUT.
            ResultDTO<Integer> resultDTO = shoppingCartClient.addItemToCart(user, txId, site, itemToCartParam);
            result.setApiRes(resultDTO);

            //Set request parameter to context for verify.
            result.setItem2Map("product", itemToCartParam);
            result.setItem2Map("user", user);
            result.setItem2Map("site", site);


        }catch (Exception e){
            result.setItem2Map("Exception" , "YES");
            result.setApiRes(null);
            Logger.error("Call shoppingCartClient.addItemToCart throw exception. " + e.getMessage());
        }finally {
            result.setCaseNO(caseNo);
            return result;
        }
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

