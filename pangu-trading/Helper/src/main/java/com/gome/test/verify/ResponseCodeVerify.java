package com.gome.test.verify;

import com.gome.framework.base.ResultDTO;
import com.gome.test.util.TestResultDO;
import org.testng.Assert;

/**
 * Created by weijianxing on 2016/12/7.
 */
public class ResponseCodeVerify {

    public static void verifyReturnCodeSuccess(TestResultDO response){
        ResultDTO resultDTO = response.getApiRes();
        if(resultDTO == null){
            Assert.fail("Call call interface fail.");
        }
        String code = resultDTO.getErrCode();
        Assert.assertEquals(code,"0" , "verify response code fail.");
    }


    public static void verifyReturnCodeFail(TestResultDO response){
        ResultDTO resultDTO = response.getApiRes();
        if(resultDTO == null){
            String eflag = (String)response.getRequestMap().get("Exception");
            //If response data is null then verify throw exception.
            Assert.assertEquals(eflag, "YES");
        }else{
            String code = resultDTO.getErrCode();
            Assert.assertNotEquals(code,"0" , "verify response code fail.");
        }

    }
}
