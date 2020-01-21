package com.callcar.dao.vo.person;

import lombok.Data;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 10:01
 * @Description
 */
@Data
public class PersonFindCarDto {
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
}
