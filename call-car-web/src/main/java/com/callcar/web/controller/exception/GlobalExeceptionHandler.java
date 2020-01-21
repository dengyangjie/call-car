package com.callcar.web.controller.exception;

import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 05:30
 * @Description
 */
@Slf4j
@RestControllerAdvice
public class GlobalExeceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ReturnMsg excption(Exception e, HttpServletRequest request){
        log.error("全局异常处理 错误堆栈信息{}",e);
        String eMessage = e.getMessage();
        StringBuffer url = request.getRequestURL();
        //打印日志
        log.error("错误信息-->"+eMessage+"===请求链接--->"+url);
        return ReturnBuilder.failed();
    }
}
