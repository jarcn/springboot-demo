package com.study.springboot.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

//组合注解
@RestController
//关闭特定的自动配置
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@Slf4j
public class SpringBootDemoApplication {

//   使用@Value注解注入配置文件中对应的值
//    @Value("${code.name}")
//    private String coderName;
//    @Value("${code.tool}")
//    private String coderTools;

    @Autowired
    private CoderInfo coderInfo;

    @RequestMapping("/")
    String index(){
//        return "Who is make this project:"+coderName+
//                " And what is dev tool used :" + coderTools;
        log.debug("测试日志打印");
        return "Who is make this project:"+coderInfo.getName()+
                " And what is dev tool used :" + coderInfo.getTool();
    }

    public static void main(String[] args){
        SpringApplication.run(SpringBootDemoApplication.class,args);
    }
}
