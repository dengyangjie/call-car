package com.callcar.dao.mapper;

import com.callcar.dao.domain.PersonFindCar;
import com.callcar.dao.domain.PersonFindCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonFindCarMapper {
    long countByExample(PersonFindCarExample example);

    int deleteByExample(PersonFindCarExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(PersonFindCar record);

    int insertSelective(PersonFindCar record);

    List<PersonFindCar> selectByExample(PersonFindCarExample example);

    PersonFindCar selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") PersonFindCar record, @Param("example") PersonFindCarExample example);

    int updateByExample(@Param("record") PersonFindCar record, @Param("example") PersonFindCarExample example);

    int updateByPrimaryKeySelective(PersonFindCar record);

    int updateByPrimaryKey(PersonFindCar record);

    List<PersonFindCar> personFindCarQryList(PersonFindCar personFindCar);
}