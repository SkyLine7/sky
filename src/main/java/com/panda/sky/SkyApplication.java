package com.panda.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * springboot 启动类: 继承SpringBootServletInitializer重写configure方法,去除内嵌的tomcat
 * @author pcongda
 */
@SpringBootApplication
@EnableScheduling //启用springboot计划任务
@EnableJpaRepositories(basePackages = "com.panda.sky.repository") //指定springdatajpa 基础包位置
public class SkyApplication extends SpringBootServletInitializer{

	public SkyApplication() {
		super();
		setRegisterErrorPageFilter(false);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SkyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SkyApplication.class, args);
	}
}
