package org.divya.model;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 5, max = 10)
	private String name;
	private String gender;
	private String introduction;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getIntroduction() {
		return introduction;
	}
	
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	

}
