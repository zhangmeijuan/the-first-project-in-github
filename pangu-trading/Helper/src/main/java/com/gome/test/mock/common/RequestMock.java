package com.gome.test.mock.common;

import com.gome.pangu.trading.bo.User;
import com.gome.pangu.trading.cart.client.dto.param.AddItemToCartParam;

import java.util.List;

/**
 * Created by weijianxing on 2016/12/7.
 */
public interface RequestMock {
    public User getValidateUser();
    public User getInvalidateUser();

    public String getSite(String flag);
    public String getRandomSite();
    public String getValidateSiteRandom();

    public AddItemToCartParam getSMIProduct();
    public AddItemToCartParam get3PPProduct();
    public AddItemToCartParam getNPOPProduct();
    public AddItemToCartParam getRandomProduct();

    public List<AddItemToCartParam> getProductByNum(int number);
}
