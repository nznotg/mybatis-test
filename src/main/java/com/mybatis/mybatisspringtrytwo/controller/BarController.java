package com.mybatis.mybatisspringtrytwo.controller;

import com.mybatis.mybatisspringtrytwo.domain.entity.Bar;
import com.mybatis.mybatisspringtrytwo.repository.BarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bar")
public class BarController {
    //
    private BarMapper barMapper;

    @Autowired
    public BarController(BarMapper barMapper) {
        this.barMapper = barMapper;
    }

    @PostMapping(value = "/register")
    public String registerBar(@RequestBody Bar bar) {
        try {
            barMapper.insertBar(bar);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed register bar";
        }
        return bar.getName();
    }

    @GetMapping("/list")
    public List<Bar> getList() {
        //
        return barMapper.selectList();
    }
}
