package com.gome.test.api.shoppingcartclient;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Resource;

import com.gome.framework.base.ResultDTO;
import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.common.constants.SiteEnum;
import com.gome.test.utils.*;
import com.gome.test.api.adapter.IAdapter;
import com.gome.test.api.adapter.IConvert;
import com.gome.pangu.trading.cart.client.ShoppingCartClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class ShoppingCartClientClearCartAdapter extends IAdapter<ShoppingCartClient> implements IConvert{

    @Resource(name = "shoppingCartClient")
    ShoppingCartClient shoppingCartClient;

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

    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-all.xml");
        shoppingCartClient  = context.getBean("shoppingCartClient" , ShoppingCartClient.class);
    }

    @Test
    public void callTest(){
        init();
        if(shoppingCartClient != null){
            //SiteEnum
            SiteEnum.homeSite.toString();
            User user = new User();
            String site =  SiteEnum.homeSite.toString();
            user.setUserId("100011689765");
            user.setLoginName("fuckjd");
            user.setUserIP("10.144.16.90");
            user.setIsBlack(false);
            user.setMobile("13655555566");
            user.setInternalStaff(false);
            user.setInternalUser(false);
            user.setUserGrade("G4");
            user.setWhereFrom("beijing");
            user.setUserType(User.UserType.COMMON);
            user.setIsMobileActivated("YES");
            user.setLoginStatus(User.LoginStatus.logined);
//            user.setLoginStatus(User.LoginStatus.);

            String txid = UUID.randomUUID().toString();
//            shoppingCartClient.getCurrentAllowanceInfo(user , txid , site);
            ResultDTO resultDTO = shoppingCartClient.clearCart(user, txid, site);
            System.out.println("response message : "+resultDTO.getErrMsg());
            System.out.println("response code : "+resultDTO.getErrCode());
            System.out.println("response data : "+resultDTO.getData().toString());
        }
    }

}

