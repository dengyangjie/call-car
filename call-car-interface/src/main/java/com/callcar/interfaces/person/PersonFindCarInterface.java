package com.callcar.interfaces.person;

import com.callcar.common.msg.ReturnMsg;
import com.callcar.dao.vo.person.PersonFindCarDto;

import java.util.List;

/**
 * @author dengyangjie
 * @version v1.0
 * @Date 2020-1-21下午 10:05
 * @Description
 */
public interface PersonFindCarInterface {
    /**人找车信息发布*/
    ReturnMsg personFindCarPublishInfo(PersonFindCarDto personFindCarDto);
    /**人找车信息展示查询*/
    List<PersonFindCarDto> personFindCarInfoQry(PersonFindCarDto personFindCarDto);
}
