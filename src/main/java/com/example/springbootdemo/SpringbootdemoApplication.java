package com.example.springbootdemo;

import com.example.springbootdemo.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringbootdemoApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Car car1 = run.getBean(Car.class);
        Car car2 = run.getBean(Car.class);
        car1.setName("bmw");
        System.out.println(car1 == car2);
    }

}
