package com.gome.test.util;


import com.gome.framework.base.ResultDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weijianxing on 2015/7/20.
 * Used for storage testcase return info and diff testcase by caseName at ***Verify..
 */
public class TestResultDO extends BaseUtil{

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public ResultDTO getApiRes() {
        return apiRes;
    }

    public void setApiRes(ResultDTO apiRes) {
        this.apiRes = apiRes;
    }

    private String caseName = "";
    private ResultDTO apiRes = null;

    public int getCaseNO() {
        return caseNO;
    }

    public void setCaseNO(int caseNO) {
        this.caseNO = caseNO;
    }

    private int caseNO ;

    public Map<String, Object> getRequestMap() {
        return request;
    }

    //Add the request value or validate value to map.
    private Map<String , Object> request= new HashMap<String ,Object>();

    public void setItem2Map(String key , Object val){
        request.put(key , val);
    }

}
