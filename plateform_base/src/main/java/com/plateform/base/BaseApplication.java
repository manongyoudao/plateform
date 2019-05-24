package com.plateform.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }
    /**
     * 定义分布式id生成器
     */
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1);
    }
}
