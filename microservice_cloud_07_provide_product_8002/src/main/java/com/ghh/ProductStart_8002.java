package com.ghh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.ghh.mapper")
@EnableEurekaClient
public class ProductStart_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductStart_8002.class,args);
    }
}
