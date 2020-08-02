package com.maven.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maven.interfaces.Cars;

@Component("swift")
public class Swift implements Cars{
	
	@Autowired(required = false)
	Engine engine;
	
	@Autowired(required = true)
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	} 

	
/*	public Swift(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
*/
	public String spec() {
	String specs = "Swift from India with engine as " + engine.getType();	
		return specs;
		
	}

}
