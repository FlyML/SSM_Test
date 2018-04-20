package com.ml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ml.mapper")
public class GitDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(GitDemo01Application.class, args);
	}
}
