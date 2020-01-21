package com.callcar.service.addr;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import com.callcar.dao.domain.AreaCodeInfo;
import com.callcar.dao.mapper.AreaCodeInfoMapper;
import com.callcar.dao.vo.addr.AddressReqDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 11:25
 * @Description
 */
@Slf4j
@Service
public class AddressInfoService {
    @Autowired
    private AreaCodeInfoMapper areaCodeInfoMapper;
    /**
     * 根据条件查询地址
     * */
    public List<AddressReqDto> addressQryList(AddressReqDto addressReqDto){
        AreaCodeInfo areaCodeInfo = new AreaCodeInfo();
        BeanUtils.copyProperties(addressReqDto,areaCodeInfo);
        List<AreaCodeInfo> areaCodeInfos = areaCodeInfoMapper.areaQryList(areaCodeInfo);

        List<AddressReqDto> addressReqDtoList = new ArrayList<>();
        areaCodeInfos.forEach(a ->{
            AddressReqDto resp  = new AddressReqDto();
            BeanUtils.copyProperties(a,resp);
            addressReqDtoList.add(resp);
        });
        return addressReqDtoList;
    }
}
