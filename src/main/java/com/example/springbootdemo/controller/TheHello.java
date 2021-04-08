package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Car;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class TheHello {

    private Car car;

    @Autowired
    public TheHello(Car car) {
        this.car = car;
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
        return car;
    }

}
