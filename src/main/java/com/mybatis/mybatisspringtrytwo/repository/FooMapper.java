package com.mybatis.mybatisspringtrytwo.repository;

import com.mybatis.mybatisspringtrytwo.domain.entity.Foo;
import com.mybatis.mybatisspringtrytwo.domain.sdo.FooRdo;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface FooMapper {
    //
    @Select("SELECT * FROM nz.foo")
    @Results(id = "FooMap",
            value = {
                @Result(property = "id", column = "id"),
                @Result(property = "name", column = "name"),
            }
    )
    List<Foo> selectList();

    @Select("SELECT * FROM nz.foo WHERE id = #{id}")
    @Results(id="FooRdoMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "bars", column = "id",
                    many = @Many(select = "com.mybatis.mybatisspringtrytwo.repository.BarMapper.selectList")
            ),
    })
    FooRdo selectFooById(@Param("id") int id);






}
