package com.callcar.dao.vo.addr;

import lombok.Data;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 11:21
 * @Description
 */
@Data
public class AddressReqDto {
    private String provinceCode;
    private String provinceName;
    private String provinceLevel;
    private String parentId;
    private String areaCode;
}
