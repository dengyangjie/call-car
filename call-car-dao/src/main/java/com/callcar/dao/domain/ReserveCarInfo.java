package com.callcar.dao.domain;

import java.util.Date;

public class ReserveCarInfo {
    private Integer reserveId;

    private Integer carId;

    private Integer personId;

    private String reservePersonName;

    private String reservePersonPhone;

    private Integer reservePersonNum;

    private Date createDate;

    private Date modifyDate;

    public Integer getReserveId() {
        return reserveId;
    }

    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getReservePersonName() {
        return reservePersonName;
    }

    public void setReservePersonName(String reservePersonName) {
        this.reservePersonName = reservePersonName == null ? null : reservePersonName.trim();
    }

    public String getReservePersonPhone() {
        return reservePersonPhone;
    }

    public void setReservePersonPhone(String reservePersonPhone) {
        this.reservePersonPhone = reservePersonPhone == null ? null : reservePersonPhone.trim();
    }

    public Integer getReservePersonNum() {
        return reservePersonNum;
    }

    public void setReservePersonNum(Integer reservePersonNum) {
        this.reservePersonNum = reservePersonNum;
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