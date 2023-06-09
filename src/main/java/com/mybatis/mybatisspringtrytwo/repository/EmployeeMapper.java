package com.mybatis.mybatisspringtrytwo.repository;

import com.mybatis.mybatisspringtrytwo.domain.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    //
    @Select("SELECT * FROM nz.employee e ORDER BY e.deptno")
    @Results(id="EmployeeMap", value = {
            @Result(property = "eno", column = "empno"),
            @Result(property = "name", column = "ename"),
            @Result(property = "job", column = "job"),
            @Result(property = "manager", column = "manager"),
            @Result(property = "hireDate", column = "hiredate"),
            @Result(property = "salary", column = "sal"),
            @Result(property = "commission", column = "comm"),
            @Result(property = "dno", column = "deptno"),
    })
    List<Employee> selectList();

    @Select("SELECT * FROM nz.employee e WHERE e.sal <= #{salary}")
    @ResultMap("EmployeeMap")
    List<Employee> selectListBySalaryLessThan(@Param("salary") int salary);
}
