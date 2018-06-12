package com.joyveb.springboot.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    /**
     * 添加操作，返回新增元素的 ID
     * @param personDO
     */
    @Insert("insert into person(email,name) values(#{email},#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(User personDO);

    /**
     * 更新操作
     * @param personDO
     * @return 受影响的行数
     */
    @Update("update person set email=#{email},name=#{name} where id=#{id}")
    Long update(User personDO);

    /**
     * 删除操作
     * @param id
     * @return 受影响的行数
     */
    @Delete("delete from user where id=#{id}")
    Long delete(@Param("id") Long id);

    /**
     * 查询所有
     * @return
     */
    @Select("select id,email,name from user")
    List<User> selectAll();

    /**
     * 根据主键查询单个
     * @param id
     * @return
     */
    @Select("select id,email,name from user where id=#{id}")
    User selectById(@Param("id") Long id);

    
}
