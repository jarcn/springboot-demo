package com.joyveb.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.joyveb.springboot.beans.City;

import java.util.UUID;

/**
 * @author: chenjia
 * @date: 2018/6/29 15:19
 * @decription: 注册为 Dubbo 服务
 * @modified By:
 */
@Service(version = "1.0.0")
public class DubboProviderImpl implements DubboProviderApi {

    @Override
    public City findCityByName(String cityName) {
        return new City(UUID.randomUUID().toString(), "22", "付良", "是我的故乡");
    }
}
