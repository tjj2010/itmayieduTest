
package com.itmayiedu.app;

import javax.annotation.ManagedBean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.itmayiedu" })
@MapperScan(basePackages = { "com.itmayiedu.mapper" })
@EnableAutoConfiguration
public class AppMybatis {
	public static void main(String[] args) {
		SpringApplication.run(AppMybatis.class, args);
	}

}
