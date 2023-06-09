package com.mybatis.mybatisspringtrytwo.controller;

import com.mybatis.mybatisspringtrytwo.domain.entity.Foo;
import com.mybatis.mybatisspringtrytwo.domain.sdo.FooRdo;
import com.mybatis.mybatisspringtrytwo.repository.FooMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/foo")
public class FooController {
    //
//    private FooDao fooDao;
    private FooMapper fooMapper;

    @Autowired
    public FooController(FooMapper fooMapper) {
//        this.fooDao = fooDao;
        this.fooMapper = fooMapper;
    }

    @GetMapping(value = "/list")
    public List<Foo> getList() {
        return fooMapper.selectList();
    }

    @GetMapping(value = "/{id}")
    public FooRdo getFoo(@PathVariable int id) {
        //
        return fooMapper.selectFooById(id);
    }
}
