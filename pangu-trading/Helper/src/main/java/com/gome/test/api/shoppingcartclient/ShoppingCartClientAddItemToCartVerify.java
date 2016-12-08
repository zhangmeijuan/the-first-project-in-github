package com.gome.test.api.shoppingcartclient;

import com.gome.test.util.TestResultDO;
import com.gome.test.verify.BusinessVerify;
import com.gome.test.verify.ResponseCodeVerify;
import org.testng.Assert;
import com.gome.test.utils.Logger;
import com.gome.test.api.adapter.IVerify;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import javax.annotation.Resource;

@Component
@Lazy
public class ShoppingCartClientAddItemToCartVerify extends ShoppingCartClientAddItemToCartAdapter implements IVerify {

    @Resource
    BusinessVerify businessVerify;
       public void verify(Object obj) {
           TestResultDO resultDO=(TestResultDO)obj;
           String caseName = resultDO.getCaseName();
           int caseNameNO = resultDO.getCaseNO();
           switch(caseNameNO){
               case 1:
               case 5:
                   //verify return;
                   //verify business;
                   ResponseCodeVerify.verifyReturnCodeSuccess(resultDO);
                   businessVerify.verifyCartByAdd(resultDO);
                   break;
               case 2:
               case 4:

                  //verify return;
                   ResponseCodeVerify.verifyReturnCodeFail(resultDO);
                   break;
               default:
                   Logger.error("Case ID didn't exist.");
                   Assert.fail("Case ID didn't exist.");
                   break;
           }
       }
}

