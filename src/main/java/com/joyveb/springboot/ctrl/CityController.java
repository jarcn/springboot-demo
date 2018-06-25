package com.joyveb.springboot.ctrl;

import java.util.List;
import java.util.UUID;

import com.joyveb.springboot.beans.City;
import com.joyveb.springboot.mapper.CityMapper;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Slf4j
@EnableTransactionManagement // 需要事务的时候加上
@RestController
public class CityController {

    @Resource
    private CityMapper cityMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        log.debug("测试日志");
        return "test sprintboot";
    }

    @RequestMapping("/save")
    public String save() {
        City personDO = new City();
        personDO.setId(UUID.randomUUID().toString());
        personDO.setProvinceId("13");
        personDO.setCityName("hk");
        personDO.setDescription("test spring boot");
        log.debug("插入数据");
        cityMapper.insert(personDO);
        log.debug("数据插入完成");
        return personDO.getId();
    }

    @RequestMapping("/update/{id}")
    public Long update(@PathVariable String id) {
        City personDO = new City();
        personDO.setDescription("920847@qq.com");
        personDO.setCityName("陈佳");
        personDO.setProvinceId("11");
        personDO.setId(id);
        return cityMapper.update(personDO);
    }

    @RequestMapping("/delete/{id}")
    public Long delete(@PathVariable String id) {
        return cityMapper.delete(id);
    }

    @RequestMapping("/selectById/{id}")
    public City selectById(@PathVariable String id) {
        return cityMapper.selectById(id);
    }

    @RequestMapping("/selectAll")
    public List<City> selectAll() {
        return cityMapper.selectAll();
    }

    @RequestMapping("/deleteAll")
    public String deleteAll() {
        return cityMapper.deleteAll();
    }

    @RequestMapping("/transaction")
    @Transactional // 需要事务的时候加上
    public Boolean transaction() {

        deleteAll();

        int i = 3 / 0;

        save();

        return true;
    }

}
