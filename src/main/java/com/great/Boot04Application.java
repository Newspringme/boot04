package com.great;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
//@MapperScan("com.great.mapper")
public class Boot04Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Boot04Application.class, args);
	}

}
