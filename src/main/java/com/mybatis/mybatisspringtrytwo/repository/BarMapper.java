package com.mybatis.mybatisspringtrytwo.repository;

import com.mybatis.mybatisspringtrytwo.domain.entity.Bar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BarMapper {
    //
    @Select("SELECT * FROM nz.bar")
    @Results(id = "BarMap",
            value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "fooId", column = "foo_id"),
            }
    )
    List<Bar> selectList();

    @Insert("INSERT INTO nz.bar(id, name, foo_id) VALUES(#{bar.id}, #{bar.name}, #{bar.fooId})")
    void insertBar(@Param("bar") Bar bar);
}
