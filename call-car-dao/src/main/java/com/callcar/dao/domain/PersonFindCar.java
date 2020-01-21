package com.callcar.dao.domain;

import java.util.Date;

public class PersonFindCar {
    private Integer personId;

    private String personName;

    private String personPhone;

    private String personSex;

    private String personWechat;

    private Integer personReserveNum;

    private String personSendAddr;

    private String personAriveAddr;

    private String personReserveStatus;

    private String personStatus;

    private Date createDate;

    private Date modifyDate;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex == null ? null : personSex.trim();
    }

    public String getPersonWechat() {
        return personWechat;
    }

    public void setPersonWechat(String personWechat) {
        this.personWechat = personWechat == null ? null : personWechat.trim();
    }

    public Integer getPersonReserveNum() {
        return personReserveNum;
    }

    public void setPersonReserveNum(Integer personReserveNum) {
        this.personReserveNum = personReserveNum;
    }

    public String getPersonSendAddr() {
        return personSendAddr;
    }

    public void setPersonSendAddr(String personSendAddr) {
        this.personSendAddr = personSendAddr == null ? null : personSendAddr.trim();
    }

    public String getPersonAriveAddr() {
        return personAriveAddr;
    }

    public void setPersonAriveAddr(String personAriveAddr) {
        this.personAriveAddr = personAriveAddr == null ? null : personAriveAddr.trim();
    }

    public String getPersonReserveStatus() {
        return personReserveStatus;
    }

    public void setPersonReserveStatus(String personReserveStatus) {
        this.personReserveStatus = personReserveStatus == null ? null : personReserveStatus.trim();
    }

    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus == null ? null : personStatus.trim();
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