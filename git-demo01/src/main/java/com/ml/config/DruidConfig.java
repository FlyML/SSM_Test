package com.ml.config;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
	
	@ConfigurationProperties(prefix="spring.datasource")
	@Bean
	public DataSource getDataSource() {
		return new DruidDataSource();
	}
	
	@Test
	public void test() {
		System.out.println(getDataSource());
	}
}
