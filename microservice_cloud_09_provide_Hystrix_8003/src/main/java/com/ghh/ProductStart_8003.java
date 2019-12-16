package com.ghh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan("com.ghh.mapper")
@EnableEurekaClient
@EnableCircuitBreaker
public class ProductStart_8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProductStart_8003.class,args);
    }
}
