package com.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maven.Engine.V6;
import com.maven.Engine.V8;
import com.maven.cars.Celerio;
import com.maven.cars.Swift;

@Configuration
@ComponentScan("com.maven")
public class AppConfig {
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("celerio")
	public Celerio celerio() {
		return new Celerio();
	}
	
	@Bean("V6Engine")
	public V6 v6Engine() {
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8Engine() {
		return new V8();
	}
}
