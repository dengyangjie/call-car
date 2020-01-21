package com.callcar.interfaces.impl.addr;

import com.alibaba.fastjson.JSONObject;
import com.callcar.dao.vo.addr.AddressReqDto;
import com.callcar.interfaces.addr.AddressInfoInterface;
import com.callcar.service.addr.AddressInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 11:24
 * @Description
 */
@Slf4j
@Service
public class AddressInfoInterfaceImpl implements AddressInfoInterface {
    @Autowired
    private AddressInfoService addressInfoService;
    @Override
    public List<AddressReqDto> addressQryList(AddressReqDto addressReqDto) {
        log.info("地区查询 省级地区查询,请求入参{}", JSONObject.toJSONString(addressReqDto));
        List<AddressReqDto> addressReqDtoList = addressInfoService.addressQryList(addressReqDto);
        log.info("地区查询 省级地区查询,返回参数{}", JSONObject.toJSONString(addressReqDtoList));
        return addressReqDtoList;
    }
}
