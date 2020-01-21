package com.callcar.interfaces.impl.person;

import com.alibaba.fastjson.JSONObject;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.person.PersonFindCarDto;
import com.callcar.interfaces.person.PersonFindCarInterface;
import com.callcar.service.person.PersonFindCarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 10:06
 * @Description
 */
@Slf4j
@Service
public class PersonFindCarInterfaceImpl implements PersonFindCarInterface {
    @Autowired
    private PersonFindCarService personFindCarService;
    @Override
    public ReturnMsg personFindCarPublishInfo(PersonFindCarDto personFindCarDto) {
        log.info("人找车 信息发布请求,开始记录数据库,请求入参{}", JSONObject.toJSONString(personFindCarDto));
        ReturnMsg returnMsg = personFindCarService.personFindCarPublish(personFindCarDto);
        log.info("人找车 信息发布请求,记录数据库返回参数{}",JSONObject.toJSONString(returnMsg));
        return returnMsg;
    }

    @Override
    public List<PersonFindCarDto> personFindCarInfoQry(PersonFindCarDto personFindCarDto) {
        log.info("人找车 信息展示查询,请求入参信息{}",JSONObject.toJSONString(personFindCarDto));
        List<PersonFindCarDto> personFindCarDtoList = personFindCarService.personFindCarQry(personFindCarDto);
        log.info("人找车 信息展示查询,查询条数为{}",personFindCarDtoList == null ? 0 : personFindCarDtoList.size());
        return personFindCarDtoList;
    }
}
