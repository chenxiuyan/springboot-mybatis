package com.chenxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname: SpringbootmybatisdemoApplication
 * @description: 项目启动类
 * @author: chenxy
 * @create: 2018-10-15 19:26
 * @version: 1.0
 **/
@SpringBootApplication
public class SpringbootmybatisdemoApplication {

	public static void main(String[] args) {
        System.out.println("springboot-------------------开始启动");
		SpringApplication.run(SpringbootmybatisdemoApplication.class, args);
        System.out.println("springboot-------------------启动完成");
	}
}
