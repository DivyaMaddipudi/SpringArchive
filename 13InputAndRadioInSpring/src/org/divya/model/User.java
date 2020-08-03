package org.divya.model;

public class User {
	
	private String name;
	private String gender;
	private String country;
	private String introduction;
	private String interests[];
	
	
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
	
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	
	
	public String[] getInterests() {
		return interests;
	}
	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + "]";
	}

}
