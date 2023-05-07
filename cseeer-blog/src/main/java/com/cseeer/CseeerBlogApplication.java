package com.cseeer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类
@SpringBootApplication
@MapperScan("com.cseeer.mapper")
public class CseeerBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(CseeerBlogApplication.class, args);
    }
}
