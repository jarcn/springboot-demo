package com.joyveb.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.joyveb.springboot.beans.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: chenjia
 * @date: 2018/6/29 15:35
 * @decription:
 * @modified By:
 */
@Slf4j
@Component
public class DubboConsumer {

    @Reference(version = "1.0.0")
    DubboProviderApi dubboProviderApi;

    public void printCity() {
        String cityName = "温岭";
        City city = dubboProviderApi.findCityByName(cityName);
        log.debug(city.toString());
    }
}
