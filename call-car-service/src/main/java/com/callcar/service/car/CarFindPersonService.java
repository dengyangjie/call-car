package com.callcar.service.car;

import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.domain.CarFindPerson;
import com.callcar.dao.mapper.CarFindPersonMapper;
import com.callcar.dao.vo.car.CarFindPersonReqDto;
import com.callcar.dao.vo.car.CarFindPersonRespDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 04:02
 * @Description
 */
@Slf4j
@Service
public class CarFindPersonService {
    @Autowired
    private CarFindPersonMapper carFindPersonMapper;
    /**
     * @description 车找人信息录入
     * @param carFindPersonReqDto 车找人信息录入请求入参
     * @return ReturnMsg 公共通用返回类
     * */
    public ReturnMsg carFindPersonPublishInfo(CarFindPersonReqDto carFindPersonReqDto){
        CarFindPerson carFindPerson = new CarFindPerson();
        BeanUtils.copyProperties(carFindPersonReqDto,carFindPerson);
        int result = carFindPersonMapper.insertSelective(carFindPerson);
        return result == 1 ? ReturnBuilder.success(null) : ReturnBuilder.failed();
    }
    /**
     * @description 查询可预约车辆
     * @param carFindPersonReqDto 车找人信息录入请求入参
     * @return ReturnMsg 公共通用返回类
     * */
    public List<CarFindPersonRespDto> queryCarInfo(CarFindPersonReqDto carFindPersonReqDto){
        CarFindPerson carFindPerson = new CarFindPerson();
        BeanUtils.copyProperties(carFindPersonReqDto,carFindPerson);
        List<CarFindPerson> carFindPeople = carFindPersonMapper.queryCarInfo(carFindPerson);
        // 倒叙排序
        List<CarFindPerson> carFindPersonList = carFindPeople.stream().sorted(Comparator.comparing(CarFindPerson::getCarId).reversed()).collect(Collectors.toList());
        // 赋值
        List<CarFindPersonRespDto> respDtoList = new ArrayList<>(carFindPersonList.size());
        carFindPersonList.forEach(t -> {
            CarFindPersonRespDto carFindPersonRespDto = new CarFindPersonRespDto();
            BeanUtils.copyProperties(t,carFindPersonRespDto);
            respDtoList.add(carFindPersonRespDto);
        });
        return respDtoList;
    }
}
