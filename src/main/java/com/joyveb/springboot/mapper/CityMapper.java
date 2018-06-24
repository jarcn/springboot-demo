package com.joyveb.springboot.mapper;

import java.util.List;

import com.joyveb.springboot.beans.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * id` varchar(10) NOT NULL,
 * `province_id` varchar(10) DEFAULT NULL,
 * `city_name` varchar(10) DEFAULT NULL,
 * `description` varchar(10) DEFAULT NULL,
 */
@Mapper
public interface CityMapper {

    /**
     * 添加操作，返回新增元素的 ID
     *
     * @param personDO
     */
    @Insert("insert into city(province_id,city_name,description) values(#{provinceId},#{cityName}),#{description}")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(City personDO);

    /**
     * 更新操作
     *
     * @param personDO
     * @return 受影响的行数
     */
    @Update("update city set province_id=#{provinceId},city_name=#{cityName},description=#{description} where id=#{id}")
    Long update(City personDO);

    /**
     * 删除操作
     *
     * @param id
     * @return 受影响的行数
     */
    @Delete("delete from city where id=#{id}")
    Long delete(@Param("id") String id);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id, province_id provinceId, city_name cityName, description from city")
    List<City> selectAll();

    /**
     * 根据主键查询单个
     *
     * @param id
     * @return
     */
    @Select("select * from city where id=#{id}")
    City selectById(@Param("id") String id);

    /**
     * 删除所有
     */
    @Delete("delete * from city")
    String deleteAll();


}
