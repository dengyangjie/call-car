package com.callcar.dao.vo.car;

import lombok.Data;

import java.util.Date;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 04:24
 * @Description
 */
@Data
public class CarFindPersonRespDto {
    private Integer carId;

    private String carUserName;

    private String carSex;

    private String carUserPhone;

    private String carWechat;

    private String carType;

    private String carPassAddr;

    private Integer carSeatPersonNum;

    private String carSendAddr;

    private String carAriveAddr;

    private String carCurrentSeatStatus;

    private String carSendStatus;

    private String carReserveStatus;

    private Integer carCurrentReserveNum;

    private Date carSendStartTime;

    private Date carSendLastTime;

    private String carRemark;

    private String carSpellType;
}
