package com.maven.specs;

import org.springframework.stereotype.Component;

import com.maven.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	@Override()
	public String type() {
		// TODO Auto-generated method stub
		return "V6 Engine";
	}

}
