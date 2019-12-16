package com.ghh.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean    //通过RestTemplate来实现调用接口
    @LoadBalanced     //表示RestTemplate开启了负载均衡
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
    @Bean
    public IRule getIReule(){
        return  new RandomRule();  //达到的目的，用我们重新选择的随机，替代默认的轮训方式
    }
}
