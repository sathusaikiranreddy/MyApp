package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyappApplication {
	
	private static ConfigurableApplicationContext appContext;
	public static void main(String[] args) {
		appContext = SpringApplication.run(MyappApplication.class, args);	
		displayAllBeans();
	}
	

    public static void displayAllBeans() {
        String[] allBeanNames = appContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
          //  System.out.println(beanName);
        }
    }

}
