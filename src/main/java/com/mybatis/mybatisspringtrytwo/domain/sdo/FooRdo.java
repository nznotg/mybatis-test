package com.mybatis.mybatisspringtrytwo.domain.sdo;

import com.mybatis.mybatisspringtrytwo.domain.entity.Bar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FooRdo {
    //
    private int id;
    private String name;
    private List<Bar> bars;

}
