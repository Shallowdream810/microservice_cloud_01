package com.ghh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ghh"}) //扫描另外一个Feign的接口
public class ConsumStart_Feign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumStart_Feign.class,args);
    }
}
