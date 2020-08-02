package com.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maven.cars.Celerio;
import com.maven.cars.Swift;
import com.maven.specs.EngineType;

@Configuration
@ComponentScan("com.maven")
public class AppConfig {
	
	@Bean("celerio")
	public Celerio celerio() {
		return new Celerio();
	}
	
	@Bean("swift") 
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("New V8 eNGINE");
	}
}
