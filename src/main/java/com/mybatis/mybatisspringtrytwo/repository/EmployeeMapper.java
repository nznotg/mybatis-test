package com.mybatis.mybatisspringtrytwo.repository;

import com.mybatis.mybatisspringtrytwo.domain.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    //
    @Select("SELECT * FROM nz.employee")
    List<Employee> selectList();
}
