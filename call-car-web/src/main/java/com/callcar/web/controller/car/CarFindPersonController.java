package com.callcar.web.controller.car;

import com.alibaba.fastjson.JSONObject;
import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.car.CarFindPersonReqDto;
import com.callcar.dao.vo.car.CarFindPersonRespDto;
import com.callcar.interfaces.car.CarFindPersionInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/car")
public class CarFindPersonController {
    @Autowired
    private CarFindPersionInterface carFindPersionInterface;
    /**
     * 车找人信息注册
     * */
    @PostMapping(value = "/publish")
    public ReturnMsg carFindPerson(@RequestBody CarFindPersonReqDto carFindPersonReqDto){
        log.info("车找人信息发布,请求入参{}", carFindPersonReqDto);
        ReturnMsg returnMsg = carFindPersionInterface.carFindPersonEnterInfo(carFindPersonReqDto);
        log.info("车找人发布信息,返回参数{}",JSONObject.toJSONString(returnMsg));
        return returnMsg;
    }
    /**
     * 车找人页面展示
     * */
    @PostMapping("/queryCarInfoList")
    public ReturnMsg queryCarInfo(@RequestBody JSONObject params){
        log.info("车找人 页面默认展示可预约车辆,请求入参{}", params.toJSONString());
        CarFindPersonReqDto carFindPersonReqDto = new CarFindPersonReqDto();
        if(params != null && !"".equals(params) ){
            carFindPersonReqDto = JSONObject.parseObject(params.toJSONString(),CarFindPersonReqDto.class);
        }
        List<CarFindPersonRespDto> carFindPersonRespDtos = carFindPersionInterface.queryCarInfo(carFindPersonReqDto);
        log.info("车找人 页面目前可预约车辆数量{}",carFindPersonRespDtos.size());
        ReturnMsg result = ReturnBuilder.success(carFindPersonRespDtos);
        return result;
    }

}
