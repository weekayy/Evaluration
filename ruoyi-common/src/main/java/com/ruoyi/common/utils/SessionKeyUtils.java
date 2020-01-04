package com.ruoyi.common.utils;

import com.ruoyi.common.utils.http.HttpUtils;
import java.net.URLDecoder;

public class SessionKeyUtils {


    public static String getSessionKey(String code,String appid,String secret){

        try {
            code = URLDecoder.decode(code,"utf-8");
            appid = URLDecoder.decode(appid,"utf-8");
            secret = URLDecoder.decode(secret,"utf-8");
        }catch (Exception e){
            e.printStackTrace();
        }
        String url="https://api.weixin.qq.com/sns/jscode2session";
        String param="appid="+ appid +"&secret=" + secret + "&js_code="+ code + "&grant_type=authorization_code";
       return HttpUtils.sendGet(url,param);


    }
}
