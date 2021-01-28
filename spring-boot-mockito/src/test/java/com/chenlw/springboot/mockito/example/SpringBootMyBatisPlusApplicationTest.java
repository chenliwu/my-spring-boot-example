package com.chenlw.springboot.mockito.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenlw.springboot.mockito.*.dao")
public class SpringBootMyBatisPlusApplicationTest {

}