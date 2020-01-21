package com.callcar.service.person;

import com.callcar.common.msg.ReturnBuilder;
import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.domain.PersonFindCar;
import com.callcar.dao.mapper.PersonFindCarMapper;
import com.callcar.dao.vo.person.PersonFindCarDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 10:08
 * @Description
 */
@Slf4j
@Service
public class PersonFindCarService {

    @Autowired
    private PersonFindCarMapper personFindCarMapper;
    /**
     * 人找车 信息发布
     *
     * */
    public ReturnMsg personFindCarPublish(PersonFindCarDto personFindCarDto){
        PersonFindCar personFindCar = new PersonFindCar();
        BeanUtils.copyProperties(personFindCarDto,personFindCar);
        int result = personFindCarMapper.insertSelective(personFindCar);
        return result == 1 ? ReturnBuilder.success(null) : ReturnBuilder.failed();
    }
    /**
     * 人找车 查询接口
     * */
    public List<PersonFindCarDto> personFindCarQry(PersonFindCarDto personFindCarDto){
        PersonFindCar personFindCar = new PersonFindCar();
        BeanUtils.copyProperties(personFindCarDto,personFindCar);
        List<PersonFindCar> personFindCars = personFindCarMapper.personFindCarQryList(personFindCar);
        List<PersonFindCarDto> personFindCarDtoList = new ArrayList<>();
        personFindCars.forEach(r -> {
            PersonFindCarDto resp = new PersonFindCarDto();
            BeanUtils.copyProperties(r,resp);
            personFindCarDtoList.add(resp);
        });
        return personFindCarDtoList;
    }
}
