package com.maven.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.maven.interfaces.Cars;
import com.maven.interfaces.Engine;

@Component("swift")
public class Swift implements Cars{
	
	@Autowired()
	@Qualifier("V6Engine")
	Engine engine;

/*	public Swift(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
*/
	public String spec() {
	String specs = "Swift from India with engine as " + engine.type();	
		return specs;
		
	}

}
