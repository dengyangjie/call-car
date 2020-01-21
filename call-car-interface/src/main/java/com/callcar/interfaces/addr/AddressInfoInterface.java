package com.callcar.interfaces.addr;

import com.callcar.dao.vo.addr.AddressReqDto;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 11:22
 * @Description
 */
public interface AddressInfoInterface {
    /**地区信息查询*/
    List<AddressReqDto> addressQryList(AddressReqDto addressReqDto);
}
