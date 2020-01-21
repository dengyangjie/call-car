package com.callcar.interfaces.impl.car;

import com.alibaba.fastjson.JSONObject;
import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.car.CarFindPersonReqDto;
import com.callcar.dao.vo.car.CarFindPersonRespDto;
import com.callcar.interfaces.car.CarFindPersionInterface;
import com.callcar.service.car.CarFindPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21上午 10:43
 * @Description
 */
@Service
@Slf4j
public class CarFindPersionInterfaceImpl implements CarFindPersionInterface {
    @Autowired
    private CarFindPersonService carFindPersonService;
    @Override
    public ReturnMsg carFindPersonEnterInfo(CarFindPersonReqDto carFindPersonReqDto) {
        log.info("开始调用CarFindPersonService.carFindPersonPublish,请求入参{}", JSONObject.toJSONString(carFindPersonReqDto));
        try {
           ReturnMsg returnMsg = carFindPersonService.carFindPersonPublishInfo(carFindPersonReqDto);
           log.info("车找人 信息录入返回参数{}",JSONObject.toJSONString(returnMsg));
           return returnMsg;
        } catch (Exception e) {
            log.error("车找人 信息录入异常{}",e);
            return ReturnBuilder.failed();
        }
    }

    @Override
    public List<CarFindPersonRespDto> queryCarInfo(CarFindPersonReqDto carFindPersonReqDto) {
        log.info("车找人 查询请求参数{}",JSONObject.toJSONString(carFindPersonReqDto));
        List<CarFindPersonRespDto> respDtoList = carFindPersonService.queryCarInfo(carFindPersonReqDto);
        return respDtoList;
    }
}
