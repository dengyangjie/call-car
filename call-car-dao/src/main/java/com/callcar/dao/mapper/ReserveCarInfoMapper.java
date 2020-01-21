package com.callcar.dao.mapper;

import com.callcar.dao.domain.ReserveCarInfo;
import com.callcar.dao.domain.ReserveCarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReserveCarInfoMapper {
    long countByExample(ReserveCarInfoExample example);

    int deleteByExample(ReserveCarInfoExample example);

    int deleteByPrimaryKey(Integer reserveId);

    int insert(ReserveCarInfo record);

    int insertSelective(ReserveCarInfo record);

    List<ReserveCarInfo> selectByExample(ReserveCarInfoExample example);

    ReserveCarInfo selectByPrimaryKey(Integer reserveId);

    int updateByExampleSelective(@Param("record") ReserveCarInfo record, @Param("example") ReserveCarInfoExample example);

    int updateByExample(@Param("record") ReserveCarInfo record, @Param("example") ReserveCarInfoExample example);

    int updateByPrimaryKeySelective(ReserveCarInfo record);

    int updateByPrimaryKey(ReserveCarInfo record);
}