package com.chenlw.springboot.mockito.example;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.chenlw.springboot.mockito.*.dao")
public class SpringBootMyBatisPlusApplicationTest {

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://192.168.1.170:3306/my_spring_boot_standard?characterEncoding=UTF-8&useUnicode=true&useSSL=false");
        dataSource.setUsername("root");// 用户名
        dataSource.setPassword("123456");// 密码
        return dataSource;
    }

}