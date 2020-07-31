package com.maven.cars;

import org.springframework.stereotype.Component;

import com.maven.interfaces.Car;

@Component("celerio")
public class Celerio implements Car{
	public String  spec() {
		return "celerio";
	}
}
