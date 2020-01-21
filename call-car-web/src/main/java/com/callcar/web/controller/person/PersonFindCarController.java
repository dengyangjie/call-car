package com.callcar.web.controller.person;

import com.alibaba.fastjson.JSONObject;
import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.person.PersonFindCarDto;
import com.callcar.interfaces.person.PersonFindCarInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonFindCarController {
    @Autowired
    private PersonFindCarInterface personFindCarInterface;
    @PostMapping("/enterFindCarPublish")
    public ReturnMsg personFindCarPublishInfo(@RequestBody JSONObject params){
        log.info("人找车 预约请求入参信息{}",params.toJSONString());
        if(params == null || StringUtils.isEmpty(params)){
            throw new RuntimeException("人找车 请求信息入参为空");
        }
        PersonFindCarDto personFindCarDto = JSONObject.parseObject(params.toJSONString(), PersonFindCarDto.class);
        ReturnMsg returnMsg = personFindCarInterface.personFindCarPublishInfo(personFindCarDto);
        log.info("人找车 预约请求插入数据库信息,返回参数{}",JSONObject.toJSONString(returnMsg));
        return returnMsg;
    }
    @PostMapping("/personFindCarQuery")
    public ReturnMsg personFindCarInfoQry(@RequestBody JSONObject params){
        log.info("人找车 预约信息展示查询,请求入参信息{}",params.toJSONString());
        PersonFindCarDto personFindCarDto = new PersonFindCarDto();
        if(params != null && !"".equals(params.toJSONString())){
            personFindCarDto = JSONObject.parseObject(params.toJSONString(),PersonFindCarDto.class);
        }
        List<PersonFindCarDto> personFindCarDtoList = personFindCarInterface.personFindCarInfoQry(personFindCarDto);
        ReturnMsg returnMsg = ReturnBuilder.success(personFindCarDtoList);
        log.info("人找车 预约信息展示查询,查询返回结果{}",JSONObject.toJSONString(returnMsg));
        return returnMsg;
    }
}
