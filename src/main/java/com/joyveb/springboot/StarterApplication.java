package com.joyveb.springboot;

import com.joyveb.springboot.kafka.MyKafkaProducer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
@AutoConfigurationPackage
@MapperScan("com.joyveb.springboot")
public class StarterApplication {
    private static boolean stop = false;

    public static void main(String[] args) {
        log.debug("springboot 项目开始启动...");
        SpringApplication.run(StarterApplication.class, args);
        log.debug("springboot 项目启动完成.");
    }

}
