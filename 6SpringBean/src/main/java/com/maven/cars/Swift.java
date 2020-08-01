package com.maven.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.maven.interfaces.Cars;
import com.maven.interfaces.Engine;


public class Swift implements Cars {
	
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	
	public String specs() {
		String specs = "Engine is" + engine.type();
		return specs;
	}
}
