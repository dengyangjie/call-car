package com.callcar.web.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21上午 09:53
 * @Description
 */
@SpringBootApplication(scanBasePackages = {"com.callcar.common","com.callcar.dao.mapper","com.callcar.interfaces","com.callcar.interfaces.impl","com.callcar.service","com.callcar.web"})
@MapperScan("com.callcar.dao.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
