package com.zhangxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyApplication.class, args);
		System.err.println("ce");
		System.out.println("df");
	}
}