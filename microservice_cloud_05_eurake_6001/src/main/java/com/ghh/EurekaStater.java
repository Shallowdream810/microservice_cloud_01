package com.ghh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//标注的启动该新组件技术的相关注解标签
@EnableEurekaServer    // 服务器端启动类，接收其他微服务注册进来
public class EurekaStater {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStater.class,args);
    }
}
