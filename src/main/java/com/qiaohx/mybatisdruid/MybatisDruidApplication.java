package com.qiaohx.mybatisdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiaohx.mybatisdruid.mapper")
public class MybatisDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDruidApplication.class, args);
    }

}
