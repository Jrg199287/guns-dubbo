package com.stylefeng.guns.rest;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
@EnableDubbo
public class GunsGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunsGetawayApplication.class, args);
    }
}
