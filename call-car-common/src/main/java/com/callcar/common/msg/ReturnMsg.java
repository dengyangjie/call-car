package com.callcar.common.msg;

import lombok.Data;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 03:39
 * @Description
 */
@Data
public class ReturnMsg<T> {
    private String code;
    private String msg;
    private T data;

    public ReturnMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ReturnMsg(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
