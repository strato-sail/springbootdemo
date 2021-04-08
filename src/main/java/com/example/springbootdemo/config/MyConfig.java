package com.example.springbootdemo.config;

import org.springframework.context.annotation.Configuration;

//true代表默认getBean是代理对象，每次从ioc容器中取出；full模式
//false代表每次重新创建对象。用于解决组件间的依赖。每次跳过检查直接创建，启动的较快所以lite
//wcy
@Configuration(proxyBeanMethods = true)
public class MyConfig {

}
