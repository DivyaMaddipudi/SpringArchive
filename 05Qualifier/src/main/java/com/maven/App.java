package com.maven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maven.interfaces.Cars;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Cars myCar = context.getBean("swift", Cars.class);
		System.out.println(myCar.spec());
		context.close();

	}

}
