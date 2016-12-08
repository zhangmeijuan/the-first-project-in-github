package com.gome.test.util;

import com.gome.test.context.ContextUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by weijianxing on 2015/8/7.
 */
public class BaseUtil {
    public static String getTxId()
    {
        String txid= UUID.randomUUID().toString();
        return txid;
    }

    public static int getCaseNumber(){
        String caseName = ContextUtils.getTestName();
        int caseNameNO = Integer.parseInt(caseName.substring(caseName.length()-2));
        return caseNameNO;
    }

    /**
     *
     * @param bitN
     * @return
     */
    public static int getCaseNumber(int bitN){
        String caseName = ContextUtils.getTestName();
        int caseNameNO = Integer.parseInt(caseName.substring(caseName.length()-bitN));
        return caseNameNO;
    }
    /**
     *
     * @param src the String separate by , eg. "testA , testB , testC"
     * @return the list contain the suString split by ","
     */
    public static List<String> String2List(String src){
        List<String> dest = new LinkedList<String>();
        String srcArray[] = src.split(",");
        for(int i = 0 ;i<srcArray.length; i++){
            dest.add(srcArray[i]);
        }
        return dest;
    }

    public static String getLocalIP(){
        String ip = "127.0.0.1";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();

            System.out.println("current ip is : " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }finally {
            return ip;
        }
    }

    /**
     *
     * @param src
     * @return
     */
    public static String array2String(String[] src){
        String dest = "";
        int listSize = src.length;
        for(int i = 0 ; i< listSize; i++){
            dest += src[i];
           if(i != listSize-1){
               dest += ",";
           }
        }
        return dest;
    }

    /**
     *
     * @param flag get from excel if equals '1' random generate one, if equals null is "" , others case return the trID = flag.,
     * @return
     */
    public static String getTxId(String flag){
        String txID = "";
        if(flag.trim().equals("1")){
            txID = UUID.randomUUID().toString();
        }else if(flag.trim().equals("null")){
            txID = "";
        }else{
            txID = flag;
        }
        return txID;
    }
    /**
     * 字符串转换为java.util.Date<br>
     * 支持格式为 yyyy.MM.dd G 'at' hh:mm:ss z 如 '2002-1-1 AD at 22:10:59 PSD'<br>
     * yy/MM/dd HH:mm:ss 如 '2002/1/1 17:55:00'<br>
     * yy/MM/dd HH:mm:ss pm 如 '2002/1/1 17:55:00 pm'<br>
     * yy-MM-dd HH:mm:ss 如 '2002-1-1 17:55:00' <br>
     * yy-MM-dd HH:mm:ss am 如 '2002-1-1 17:55:00 am' <br>
     * @param time String 字符串<br>
     * @return Date 日期<br>
     */
    public static Date stringToDate(String time){
        if(time!=null && time.toUpperCase().equals("NULL") ){
            return null;
        }
        //Add date support express.
        if(time==null || time.length()==0 ||  time.substring(0 , 4).equals("$NOW")){
            Calendar rightNow = Calendar.getInstance();
            if(time==null || time.length()==0 || time.trim().length() == 4){
                return  rightNow.getTime();
            }
            int days = Integer.parseInt(time.substring(5));
            if(time.substring(4 , 5).equals("-")){
                //
                days = 0 - days;
            }

            //preset future date.
            rightNow.add(Calendar.DAY_OF_YEAR,days);//add day
            return rightNow.getTime();
        }
        SimpleDateFormat formatter;
        int tempPos=time.indexOf("AD") ;
        time=time.trim() ;
        formatter = new SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss z");
        if(tempPos>-1){
            time=time.substring(0,tempPos)+
                    "公元"+time.substring(tempPos+"AD".length());//china
            formatter = new SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss z");
        }
        tempPos=time.indexOf("-");
        if(tempPos>-1&&(time.indexOf(" ")<0)){
            formatter = new SimpleDateFormat ("yyyyMMddHHmmssZ");
        }
        else if((time.indexOf("/")>-1) &&(time.indexOf(" ")>-1)){
            formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        }
        else if((time.indexOf("-")>-1) &&(time.indexOf(" ")>-1)){
            formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        }
        else if((time.indexOf("/")>-1) &&(time.indexOf("am")>-1) ||(time.indexOf("pm")>-1)){
            formatter = new SimpleDateFormat ("yyyy-MM-dd KK:mm:ss a");
        }
        else if((time.indexOf("-")>-1) &&(time.indexOf("am")>-1) ||(time.indexOf("pm")>-1)){
            formatter = new SimpleDateFormat ("yyyy-MM-dd KK:mm:ss a");
        }
        ParsePosition pos = new ParsePosition(0);
        Date ctime = formatter.parse(time, pos);

        return ctime;
    }
    public static void main(String[] args){

//        String negative = "-1";
//        int ine = Integer.parseInt(negative);
//        System.out.println("Get int : " + ine);
//        String userDefineDate = "$NOW+5";
//        Date date = null;
//        date = BaseUtil.stringToDate(userDefineDate);
//
//        System.out.println("Get user define date is : " + date);
//        userDefineDate = "$NOW-37";
//        date = BaseUtil.stringToDate(userDefineDate);
//        System.out.println("Get user define date is : " + date);
//        userDefineDate = "$NOW";
//        date = BaseUtil.stringToDate(userDefineDate);
//        System.out.println("Get user define date is : " + date);
        String splitTest = "123 ,456 , 789 ,10";
        List<String> testL = BaseUtil.String2List(splitTest);
        System.out.println("split test: split size is :  " +testL.size() + " data is : "+ testL);

    }
}
