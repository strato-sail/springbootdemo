package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class TheHello {
    private Car car1;
    private Car car2;

    public TheHello( Car car1,  Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "111111");
        return "success";
    }

    @RequestMapping("/mycar")
    public Car car() {
        log.info("调用car");
        return car1;
    }

}
