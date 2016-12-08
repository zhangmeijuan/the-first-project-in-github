package com.gome.test.api.pangutrading.shoppingcartclient;

import java.util.*;
import com.gome.test.api.testng.*;
import com.gome.test.api.shoppingcartclient.*;
import javax.annotation.Resource;
import org.testng.annotations.*;
import com.gome.test.context.*;
import com.gome.test.api.annotation.*;

public class AddItemsToCartTest extends RichClientContext {

    @Resource
    ShoppingCartClientAddItemsToCartVerify verify;

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
     * addItemsToCart01
     * @author weijx
     */
    @Test(
        description="addItemsToCart01",
        dataProvider="ShoppingCartClient_addItemsToCart_addItemsToCart01",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemsToCart_addItemsToCart01(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemsToCart_addItemsToCart01");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemsToCart_addItemsToCart01")
    private Object[][] ShoppingCartClient_addItemsToCart_addItemsToCart01DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemsToCartTestParam.USERID, AddItemsToCartTestParam.SITE},
                                         new String[] {"logined", "validate"})
                        }
        };
    }

    /**
     * addItemsToCart02
     * @author weijx
     */
    @Test(
        description="addItemsToCart02",
        dataProvider="ShoppingCartClient_addItemsToCart_addItemsToCart02",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemsToCart_addItemsToCart02(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemsToCart_addItemsToCart02");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemsToCart_addItemsToCart02")
    private Object[][] ShoppingCartClient_addItemsToCart_addItemsToCart02DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemsToCartTestParam.USERID, AddItemsToCartTestParam.SITE},
                                         new String[] {"none", "validate"})
                        }
        };
    }

    /**
     * addItemsToCart03
     * @author weijx
     */
    @Test(
        description="addItemsToCart03",
        dataProvider="ShoppingCartClient_addItemsToCart_addItemsToCart03",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemsToCart_addItemsToCart03(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemsToCart_addItemsToCart03");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemsToCart_addItemsToCart03")
    private Object[][] ShoppingCartClient_addItemsToCart_addItemsToCart03DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemsToCartTestParam.USERID, AddItemsToCartTestParam.SITE},
                                         new String[] {"logined", "validate"})
                        }
        };
    }

    /**
     * addItemsToCart04
     * @author weijx
     */
    @Test(
        description="addItemsToCart04",
        dataProvider="ShoppingCartClient_addItemsToCart_addItemsToCart04",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemsToCart_addItemsToCart04(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemsToCart_addItemsToCart04");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemsToCart_addItemsToCart04")
    private Object[][] ShoppingCartClient_addItemsToCart_addItemsToCart04DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemsToCartTestParam.USERID, AddItemsToCartTestParam.SITE},
                                         new String[] {"logined", "invalidate"})
                        }
        };
    }

    /**
     * addItemsToCart05
     * @author weijx
     */
    @Test(
        description="addItemsToCart05",
        dataProvider="ShoppingCartClient_addItemsToCart_addItemsToCart05",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemsToCart_addItemsToCart05(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemsToCart_addItemsToCart05");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemsToCart_addItemsToCart05")
    private Object[][] ShoppingCartClient_addItemsToCart_addItemsToCart05DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemsToCartTestParam.USERID, AddItemsToCartTestParam.SITE},
                                         new String[] {"invalidate", "validate"})
                        }
        };
    }
}
