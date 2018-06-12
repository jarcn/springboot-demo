package com.joyveb.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@MapperScan("com.joyveb.springboot")
public class StarterApplication {

	public static void main(String[] args) {
		log.debug("springboot 项目开始启动...");
		SpringApplication.run(StarterApplication.class, args);
		log.debug("springboot 项目启动完成.");
	}

}
