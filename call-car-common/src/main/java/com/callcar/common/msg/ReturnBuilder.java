package com.callcar.common.msg;

import com.alibaba.fastjson.JSONObject;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 03:45
 * @Description
 */
public class ReturnBuilder<T> {
    public static ReturnMsg success(Object data){
       return success(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),data);
    }

    public static ReturnMsg success(String code,String msg){
        return success(code,msg,null);
    }
    public static ReturnMsg success(String code,String msg,Object data){
        ReturnMsg returnMsg = new ReturnMsg(code,msg,data);
        return returnMsg;
    }

    public static ReturnMsg failed(){
        return failed(ResultEnum.FAIL.getCode(),ResultEnum.FAIL.getMsg());
    }

    private static ReturnMsg failed(String code, String msg) {
        return failed(code,msg,null);
    }

    private static ReturnMsg failed(String code, String msg, Object data) {
        ReturnMsg returnMsg = new ReturnMsg(code,msg,data);
        return returnMsg;
    }
}
