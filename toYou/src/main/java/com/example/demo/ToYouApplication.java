package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@MapperScan(value = { "com.example.demo.mainMapper" })

@SpringBootApplication(scanBasePackages = "com.example.demo")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ToYouApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToYouApplication.class, args);
	}
	
}
