package com.ghh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启仪表盘图形化界面接口
public class DashBoard {
    public static void main(String[] args) {
        SpringApplication.run(DashBoard.class,args);
    }
}
