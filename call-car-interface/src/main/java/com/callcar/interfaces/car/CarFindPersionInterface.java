package com.callcar.interfaces.car;

import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.car.CarFindPersonReqDto;
import com.callcar.dao.vo.car.CarFindPersonRespDto;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21上午 10:42
 * @Description
 */
public interface CarFindPersionInterface {
    /**信息录入*/
    ReturnMsg carFindPersonEnterInfo(CarFindPersonReqDto carFindPersonReqDto);
    /**车辆信息查询*/
    List<CarFindPersonRespDto> queryCarInfo(CarFindPersonReqDto carFindPersonReqDto);
}
