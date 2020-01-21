package com.callcar.web.controller.addr;

import com.alibaba.fastjson.JSONObject;
import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.addr.AddressReqDto;
import com.callcar.interfaces.addr.AddressInfoInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 11:17
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("addr")
public class AddressQueryController {
    @Autowired
    private AddressInfoInterface addressInfoInterface;
    /**
     * 省级地区查询查询
     * */
    @PostMapping("provinceQry")
    public ReturnMsg provinceAreaQry(@RequestBody JSONObject provinceParams){
        log.info("地区查询 省级地区查询,请求入参{}",provinceParams.toJSONString());
        AddressReqDto addressReqDto = new AddressReqDto();
        if(provinceParams != null && StringUtils.isEmpty(provinceParams)){
            addressReqDto = JSONObject.parseObject(provinceParams.toJSONString(),AddressReqDto.class);
        }
        List<AddressReqDto> addressReqDtoList = addressInfoInterface.addressQryList(addressReqDto);
        ReturnMsg returnMsg = ReturnBuilder.success(addressReqDtoList);
        log.info("地区查询 省级地区查询,返回参数{}",JSONObject.toJSONString(returnMsg));
        return returnMsg;
    }
}
