package com.maven.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.maven.interfaces.Cars;
import com.maven.interfaces.Engine;

public class Celerio implements Cars{
	
	@Autowired
	@Qualifier("engineType")
	Engine engine;
	
	public String spec() {
		String specs = "Engine is " + engine.type();
		return specs;
	}
}
