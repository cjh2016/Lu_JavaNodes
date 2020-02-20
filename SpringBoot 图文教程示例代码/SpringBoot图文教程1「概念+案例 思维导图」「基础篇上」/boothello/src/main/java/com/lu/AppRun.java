package com.lu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lu.dao") //必须在入口类中加入这个配置
@SpringBootApplication
public class AppRun {
    public static void main(String[] args) {
        //        参数：启动类类对象 主函数形参名
        SpringApplication.run(AppRun.class,args);
    }
}
