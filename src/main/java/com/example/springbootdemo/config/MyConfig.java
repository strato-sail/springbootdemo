package com.example.springbootdemo.config;

import com.example.springbootdemo.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//true代表默认getBean是代理对象，每次从ioc容器中取出；full模式
//false代表每次重新创建对象。用于解决组件间的依赖。每次跳过检查直接创建，启动的较快所以lite
// djf;ajfa;fajfdkdkdkx
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean(value = "Car")
    public Car getCar(){
        return new Car();
    }
}
