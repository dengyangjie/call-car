package com.callcar.dao.mapper;

import com.callcar.dao.domain.CarFindPerson;
import com.callcar.dao.domain.CarFindPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarFindPersonMapper {
    long countByExample(CarFindPersonExample example);

    int deleteByExample(CarFindPersonExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(CarFindPerson record);

    int insertSelective(CarFindPerson record);

    List<CarFindPerson> selectByExample(CarFindPersonExample example);

    CarFindPerson selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") CarFindPerson record, @Param("example") CarFindPersonExample example);

    int updateByExample(@Param("record") CarFindPerson record, @Param("example") CarFindPersonExample example);

    int updateByPrimaryKeySelective(CarFindPerson record);

    int updateByPrimaryKey(CarFindPerson record);

    List<CarFindPerson> queryCarInfo(CarFindPerson record);
}