package com.callcar.dao.mapper;

import com.callcar.dao.domain.AreaCodeInfo;
import com.callcar.dao.domain.AreaCodeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaCodeInfoMapper {
    long countByExample(AreaCodeInfoExample example);

    int deleteByExample(AreaCodeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaCodeInfo record);

    int insertSelective(AreaCodeInfo record);

    List<AreaCodeInfo> selectByExample(AreaCodeInfoExample example);

    AreaCodeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaCodeInfo record, @Param("example") AreaCodeInfoExample example);

    int updateByExample(@Param("record") AreaCodeInfo record, @Param("example") AreaCodeInfoExample example);

    int updateByPrimaryKeySelective(AreaCodeInfo record);

    int updateByPrimaryKey(AreaCodeInfo record);

    List<AreaCodeInfo> areaQryList(AreaCodeInfo record);
}