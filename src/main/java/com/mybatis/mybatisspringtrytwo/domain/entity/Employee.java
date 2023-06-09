package com.mybatis.mybatisspringtrytwo.domain.entity;



import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    //
    private int eno;
    private String name;
    private String job;
    private int manager;
    private LocalDate hireDate;
    private int salary;
    private int commission;
    // FK
    private int dno;
}
