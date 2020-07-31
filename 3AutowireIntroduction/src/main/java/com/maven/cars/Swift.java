package com.maven.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maven.interfaces.Cars;

@Component
public class Swift implements Cars{
	
	@Autowired
	Engine engine;
	
	public String spec() {
		String specs = "Swift from India with engine type as" + engine.getType();
		return specs;
	}
}
