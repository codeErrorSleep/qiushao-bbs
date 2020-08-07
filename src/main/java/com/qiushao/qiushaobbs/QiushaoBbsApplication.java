package com.qiushao.qiushaobbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiushao.qiushaobbs.sys.mapper")
public class QiushaoBbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QiushaoBbsApplication.class, args);
	}

}
