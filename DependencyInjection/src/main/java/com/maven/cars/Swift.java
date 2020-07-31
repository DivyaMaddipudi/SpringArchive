package com.maven.cars;

import org.springframework.stereotype.Component;

import com.maven.interfaces.Car;


public class Swift implements Car{
	public String  spec() {
		return "Swift";
	}
}
