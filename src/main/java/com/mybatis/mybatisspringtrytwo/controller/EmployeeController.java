package com.mybatis.mybatisspringtrytwo.controller;

import com.mybatis.mybatisspringtrytwo.domain.entity.Employee;
import com.mybatis.mybatisspringtrytwo.repository.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    //
    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeController(EmployeeMapper employeeMapper) {
        //
        this.employeeMapper = employeeMapper;
    }

    @GetMapping(value = "/list")
    public List<Employee> getList(){
        //
        return this.employeeMapper.selectList();
    }
}
