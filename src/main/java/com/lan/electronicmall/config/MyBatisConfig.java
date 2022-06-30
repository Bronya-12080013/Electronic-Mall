package com.lan.electronicmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.lan.electronicmall.mbg.mapper","com.lan.electronicmall.dao"})
public class MyBatisConfig {

}
