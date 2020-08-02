package com.maven.specs;

import com.maven.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		type = "Unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}

	public String type() {
		return type;
	}

}
