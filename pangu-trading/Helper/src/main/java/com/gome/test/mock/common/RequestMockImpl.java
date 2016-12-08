package com.gome.test.mock.common;

import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.cart.client.dto.param.AddItemToCartParam;
import com.gome.pangu.trading.cart.client.dto.param.AddType;
import com.gome.pangu.trading.common.constants.SiteEnum;
import com.gome.test.util.BaseUtil;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by weijianxing on 2016/12/7.
 */
@Service

public class RequestMockImpl implements RequestMock {
    public User getValidateUser() {
        User user = new User();
        String site =  SiteEnum.homeSite.toString();
        String ip = BaseUtil.getLocalIP();
        user.setUserId("100011689765");
        user.setLoginName("fuckjd");
        user.setUserIP(ip);
        user.setIsBlack(false);
        user.setMobile("13655555566");
        user.setInternalStaff(false);
        user.setInternalUser(false);
        user.setUserGrade("G4");
        user.setWhereFrom("beijing");
        user.setUserType(User.UserType.COMMON);
        user.setIsMobileActivated("YES");
        user.setLoginStatus(User.LoginStatus.logined);
        return user;
    }





    public User getInvalidateUser() {
        User user = new User();

        String ip = BaseUtil.getLocalIP();
        user.setUserId("1111111111");
        user.setLoginName("fuckjd");
        user.setUserIP(ip);
        user.setIsBlack(false);
        user.setMobile("13655555566");
        user.setInternalStaff(false);
        user.setInternalUser(false);
        user.setUserGrade("G4");
        user.setWhereFrom("beijing");
        user.setUserType(User.UserType.COMMON);
        user.setIsMobileActivated("YES");
        user.setLoginStatus(User.LoginStatus.logined);
        return user;
    }

    public String getSite(String flag) {
        String site =  "";
        if(flag.equals("validate")){
//            site = getRandomSite();
            site = SiteEnum.homeSite.toString();
        }else {
            site = "X-00-X";
        }
        return site;
    }




    public String getRandomSite(){
        String site =  "";
        SiteEnum[] sites = SiteEnum.values();
        int seed = sites.length;
        Random random = new Random();
        int index = random.nextInt(seed);
        site = sites[index].toString();
        return site;
    }

    @Test
    public void tesTandomSite(){
        for(int i = 0 ;i<10 ;i++){

            String site = getRandomSite();

            System.out.println("site is : " + site);
        }
    }

    public String getValidateSiteRandom() {
        return null;
    }

    public AddItemToCartParam getSMIProduct() {
        AddItemToCartParam param3 = new AddItemToCartParam();
        param3.setAddType(AddType.normal);
        param3.setProductId("prod21010025");
        param3.setSkuId("sku20860011");
        param3.setQuantity(1);
        param3.setSiteId(SiteEnum.homeSite.getSiteId());
        return param3;
    }

    /*
    AddItemToCartParam param = new AddItemToCartParam();param.setAddType(AddType.directional);param.setProductId("prod21010051");param.setSkuId("sku20910021");param.setQuantity(1);param.setSalePromotionId("promo12315646546");param.setSiteId(SiteEnum.directionalCouponSite.getSiteId());

AddItemToCartParam param = new AddItemToCartParam();param.setAddType(AddType.rushbuy);param.setSiteId(SiteEnum.rushBuySite.getSiteId());param.setQuantity(1);param.setProductId("prod18190075");param.setSkuId("sku18120055");param.setSalePromotionId("Q8100002722");

AddItemToCartParam param = new AddItemToCartParam();param.setAddType(AddType.haiwaigou);param.setSiteId(homeSiteId);param.setQuantity(1);param.setProductId("A0000119140");param.setSkuId("pop8001009086");

     */
    public AddItemToCartParam get3PPProduct() {
        AddItemToCartParam param = new AddItemToCartParam();
        param.setAddType(AddType.normal);
        param.setProductId("prod21010051");
        param.setSkuId("sku20910021");
        param.setQuantity(1);
        param.setSalePromotionId("promo12315646546");
        param.setSiteId(SiteEnum.homeSite.getSiteId());
        return param;
    }

    public AddItemToCartParam getNPOPProduct() {
        AddItemToCartParam param3 = new AddItemToCartParam();
        param3.setAddType(AddType.normal);
        param3.setProductId("A0000116696");
        param3.setSkuId("pop8001004193");
        param3.setQuantity(1);
        param3.setSiteId(SiteEnum.homeSite.getSiteId());
        return param3;
    }

    public AddItemToCartParam getRandomProduct(){
        Random random = new Random();
        int index = random.nextInt(3);
        if(index == 0){
            return get3PPProduct();
        }else if(index == 1){
            return getNPOPProduct();
        }else{
            return getSMIProduct();
        }
    }

    public List<AddItemToCartParam> getProductByNum(int number) {

//        SMI _http://item.atguat.com.cn/prod21010025-sku20860011.html
//        G3PP _http://item.atguat.com.cn/9100007807-1000009787.html
//        3PP _http://item.atguat.com.cn/prod21010078-sku20910020.html
//        B3PP _http://item.atguat.com.cn/A0000116696-pop8001004193.html

        List<AddItemToCartParam> list = new ArrayList<AddItemToCartParam>();
        AddItemToCartParam param = new AddItemToCartParam();
        param.setAddType(AddType.normal);
        param.setProductId("prod21010051");
        param.setSkuId("sku20910021");
        param.setQuantity(1);
        param.setSalePromotionId("promo12315646546");
        param.setSiteId(SiteEnum.homeSite.getSiteId());

        AddItemToCartParam param2 = new AddItemToCartParam();
        param2.setAddType(AddType.normal);
        param2.setProductId("9100007807");
        param2.setSkuId("1000009787");
        param2.setQuantity(1);
        param2.setSiteId(SiteEnum.homeSite.getSiteId());

        AddItemToCartParam param3 = new AddItemToCartParam();
        param3.setAddType(AddType.normal);
        param3.setProductId("prod21010025");
        param3.setSkuId("sku20860011");
        param3.setQuantity(1);
        param3.setSiteId(SiteEnum.homeSite.getSiteId());
        list.add(param);
        list.add(param2);
        list.add(param3);
        return list;
//        AddItemToCartParam param2 = new AddItemToCartParam();
//        param.setAddType(AddType.rushbuy);
//        param.setSiteId(SiteEnum.rushBuySite.getSiteId());
//        param.setQuantity(1);param.setProductId("prod18190075");
//        param.setSkuId("sku18120055");
//        param.setSalePromotionId("Q8100002722");
//
//        AddItemToCartParam param3 = new AddItemToCartParam();
//        param.setAddType(AddType.haiwaigou);
//        param.setSiteId(homeSiteId);
//        param.setQuantity(1);
//        param.setProductId("A0000119140");
//        param.setSkuId("pop8001009086");

    }
}
