package com.royal.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.royal.core.ioc.AppConfig;
import com.royal.core.ioc.Food;
import com.royal.core.ioc.IceCream;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Food obj1 = (Food) context.getBean("food1");
		IceCream obj2 = (IceCream) context.getBean("ice1");
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
