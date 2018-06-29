package com.joyveb.springboot.dubbo;

import com.joyveb.springboot.beans.City;

/**
 * @author: chenjia
 * @date: 2018/6/29 15:30
 * @decription: 城市业务 Dubbo 服务层
 * @modified By:
 */
public interface DubboProviderApi {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
