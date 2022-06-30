package com.lan.electronicmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.lan.electronicmall.mbg.mapper","com.com.lan.electronicmall.dao"})
public class ElectronicMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElectronicMallApplication.class, args);
    }
}
