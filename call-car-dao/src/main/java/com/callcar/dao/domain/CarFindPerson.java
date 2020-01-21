package com.callcar.dao.domain;

import java.util.Date;

public class CarFindPerson {
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

    private Date createDate;

    private Date modifyDate;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarUserName() {
        return carUserName;
    }

    public void setCarUserName(String carUserName) {
        this.carUserName = carUserName == null ? null : carUserName.trim();
    }

    public String getCarSex() {
        return carSex;
    }

    public void setCarSex(String carSex) {
        this.carSex = carSex == null ? null : carSex.trim();
    }

    public String getCarUserPhone() {
        return carUserPhone;
    }

    public void setCarUserPhone(String carUserPhone) {
        this.carUserPhone = carUserPhone == null ? null : carUserPhone.trim();
    }

    public String getCarWechat() {
        return carWechat;
    }

    public void setCarWechat(String carWechat) {
        this.carWechat = carWechat == null ? null : carWechat.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarPassAddr() {
        return carPassAddr;
    }

    public void setCarPassAddr(String carPassAddr) {
        this.carPassAddr = carPassAddr == null ? null : carPassAddr.trim();
    }

    public Integer getCarSeatPersonNum() {
        return carSeatPersonNum;
    }

    public void setCarSeatPersonNum(Integer carSeatPersonNum) {
        this.carSeatPersonNum = carSeatPersonNum;
    }

    public String getCarSendAddr() {
        return carSendAddr;
    }

    public void setCarSendAddr(String carSendAddr) {
        this.carSendAddr = carSendAddr == null ? null : carSendAddr.trim();
    }

    public String getCarAriveAddr() {
        return carAriveAddr;
    }

    public void setCarAriveAddr(String carAriveAddr) {
        this.carAriveAddr = carAriveAddr == null ? null : carAriveAddr.trim();
    }

    public String getCarCurrentSeatStatus() {
        return carCurrentSeatStatus;
    }

    public void setCarCurrentSeatStatus(String carCurrentSeatStatus) {
        this.carCurrentSeatStatus = carCurrentSeatStatus == null ? null : carCurrentSeatStatus.trim();
    }

    public String getCarSendStatus() {
        return carSendStatus;
    }

    public void setCarSendStatus(String carSendStatus) {
        this.carSendStatus = carSendStatus == null ? null : carSendStatus.trim();
    }

    public String getCarReserveStatus() {
        return carReserveStatus;
    }

    public void setCarReserveStatus(String carReserveStatus) {
        this.carReserveStatus = carReserveStatus == null ? null : carReserveStatus.trim();
    }

    public Integer getCarCurrentReserveNum() {
        return carCurrentReserveNum;
    }

    public void setCarCurrentReserveNum(Integer carCurrentReserveNum) {
        this.carCurrentReserveNum = carCurrentReserveNum;
    }

    public Date getCarSendStartTime() {
        return carSendStartTime;
    }

    public void setCarSendStartTime(Date carSendStartTime) {
        this.carSendStartTime = carSendStartTime;
    }

    public Date getCarSendLastTime() {
        return carSendLastTime;
    }

    public void setCarSendLastTime(Date carSendLastTime) {
        this.carSendLastTime = carSendLastTime;
    }

    public String getCarRemark() {
        return carRemark;
    }

    public void setCarRemark(String carRemark) {
        this.carRemark = carRemark == null ? null : carRemark.trim();
    }

    public String getCarSpellType() {
        return carSpellType;
    }

    public void setCarSpellType(String carSpellType) {
        this.carSpellType = carSpellType == null ? null : carSpellType.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}