package com.hrm.company;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//1.配置springboot的包扫描
@SpringBootApplication
//2.配置mapper扫描路径
@MapperScan("com.hrm.company.mapper")
public class CompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }

}
