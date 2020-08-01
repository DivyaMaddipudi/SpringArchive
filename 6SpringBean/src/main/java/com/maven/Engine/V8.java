package com.maven.Engine;

import org.springframework.stereotype.Component;

import com.maven.interfaces.Engine;

public class V8 implements Engine {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "V8 Engine";
	}

}
