package com.gome.test.api.pangutrading.shoppingcartclient;

import java.util.*;
import com.gome.test.api.testng.*;
import com.gome.test.api.shoppingcartclient.*;
import javax.annotation.Resource;
import org.testng.annotations.*;
import com.gome.test.context.*;
import com.gome.test.api.annotation.*;

public class AddItemToCartTest extends RichClientContext {

    @Resource
    ShoppingCartClientAddItemToCartVerify verify;

    @BeforeClass
    void beforeClass() {
         verify.beforeClass();
    }

     @AfterClass
     void afterClass() {
         verify.afterClass();
     }

     @BeforeMethod
     void beforeMethod() {
         verify.beforeMethod();
     }

     @AfterMethod
     void afterMethod() {
         verify.afterMethod();
     }



    /**
     * addItemToCart01
     * @author weijx
     */
    @Test(
        description="addItemToCart01",
        dataProvider="ShoppingCartClient_addItemToCart_addItemToCart01",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCart_addItemToCart01(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCart_addItemToCart01");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCart_addItemToCart01")
    private Object[][] ShoppingCartClient_addItemToCart_addItemToCart01DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartTestParam.USERID, AddItemToCartTestParam.SITE},
                                         new String[] {"logined", "validate"})
                        }
        };
    }

    /**
     * addItemToCart02
     * @author weijx
     */
    @Test(
        description="addItemToCart02",
        dataProvider="ShoppingCartClient_addItemToCart_addItemToCart02",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCart_addItemToCart02(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCart_addItemToCart02");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCart_addItemToCart02")
    private Object[][] ShoppingCartClient_addItemToCart_addItemToCart02DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartTestParam.USERID, AddItemToCartTestParam.SITE},
                                         new String[] {"none", "validate"})
                        }
        };
    }

    /**
     * addItemToCart04
     * @author weijx
     */
    @Test(
        description="addItemToCart04",
        dataProvider="ShoppingCartClient_addItemToCart_addItemToCart04",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCart_addItemToCart04(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCart_addItemToCart04");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCart_addItemToCart04")
    private Object[][] ShoppingCartClient_addItemToCart_addItemToCart04DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartTestParam.USERID, AddItemToCartTestParam.SITE},
                                         new String[] {"logined", "invalidate"})
                        }
        };
    }

    /**
     * addItemToCart05
     * @author weijx
     */
    @Test(
        description="addItemToCart05",
        dataProvider="ShoppingCartClient_addItemToCart_addItemToCart05",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCart_addItemToCart05(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCart_addItemToCart05");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCart_addItemToCart05")
    private Object[][] ShoppingCartClient_addItemToCart_addItemToCart05DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartTestParam.USERID, AddItemToCartTestParam.SITE},
                                         new String[] {"invalidate", "validate"})
                        }
        };
    }
}
