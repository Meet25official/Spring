package com.royal.core.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name = "food1")
	public Food food1() {
		return new Food(1,"ladoo",200,true);
	}
	
	@Bean(name = "food2")
	public Food food2() {
		return new Food();
	}
	
	@Bean(name = "ice1")
	public IceCream icecream1() {
		return new IceCream("hocco", "mango", 20);
	}
	
	@Bean(name = "ice2")
	public IceCream icecream2() {
		return new IceCream();
	}

}
