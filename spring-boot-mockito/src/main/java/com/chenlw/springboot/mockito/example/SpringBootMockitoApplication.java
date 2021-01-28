package com.chenlw.springboot.mockito.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
@MapperScan("com.chenlw.springboot.mockito.example.dao")
public class SpringBootMockitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMockitoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

        };
    }


}
