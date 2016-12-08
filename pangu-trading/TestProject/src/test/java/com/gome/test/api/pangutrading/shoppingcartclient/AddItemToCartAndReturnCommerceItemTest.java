package com.gome.test.api.pangutrading.shoppingcartclient;

import java.util.*;
import com.gome.test.api.testng.*;
import com.gome.test.api.shoppingcartclient.*;
import javax.annotation.Resource;
import org.testng.annotations.*;
import com.gome.test.context.*;
import com.gome.test.api.annotation.*;

public class AddItemToCartAndReturnCommerceItemTest extends RichClientContext {

    @Resource
    ShoppingCartClientAddItemToCartAndReturnCommerceItemVerify verify;

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
     * addItemToCartAndReturnCommerceItem01
     * @author weijx
     */
    @Test(
        description="addItemToCartAndReturnCommerceItem01",
        dataProvider="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem01",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem01(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem01");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem01")
    private Object[][] ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem01DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartAndReturnCommerceItemTestParam.USERID, AddItemToCartAndReturnCommerceItemTestParam.SITE},
                                         new String[] {"logined", "validate"})
                        }
        };
    }

    /**
     * addItemToCartAndReturnCommerceItem02
     * @author weijx
     */
    @Test(
        description="addItemToCartAndReturnCommerceItem02",
        dataProvider="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem02",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem02(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem02");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem02")
    private Object[][] ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem02DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartAndReturnCommerceItemTestParam.USERID, AddItemToCartAndReturnCommerceItemTestParam.SITE},
                                         new String[] {"none", "validate"})
                        }
        };
    }

    /**
     * addItemToCartAndReturnCommerceItem04
     * @author weijx
     */
    @Test(
        description="addItemToCartAndReturnCommerceItem04",
        dataProvider="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem04",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem04(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem04");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem04")
    private Object[][] ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem04DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartAndReturnCommerceItemTestParam.USERID, AddItemToCartAndReturnCommerceItemTestParam.SITE},
                                         new String[] {"logined", "invalidate"})
                        }
        };
    }

    /**
     * addItemToCartAndReturnCommerceItem05
     * @author weijx
     */
    @Test(
        description="addItemToCartAndReturnCommerceItem05",
        dataProvider="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem05",
        timeOut=300000
    )
    @CaseOwner(description="weijx")
    public void ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem05(Map<String, String> kvs) throws Exception {
        ContextUtils.addToContext("CASE_ID","ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem05");
        Object result = verify.adapter(kvs);
        verify.verify(result);
    }

    @DataProvider(name="ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem05")
    private Object[][] ShoppingCartClient_addItemToCartAndReturnCommerceItem_addItemToCartAndReturnCommerceItem05DataProvider() throws Exception {
         return new Object[][]{
                        {
                                ContextUtils.toMap(
                                         new String[] {AddItemToCartAndReturnCommerceItemTestParam.USERID, AddItemToCartAndReturnCommerceItemTestParam.SITE},
                                         new String[] {"invalidate", "validate"})
                        }
        };
    }
}
