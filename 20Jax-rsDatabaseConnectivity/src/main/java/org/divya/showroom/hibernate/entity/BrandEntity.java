package org.divya.showroom.hibernate.entity;

public class BrandEntity {
	
	private int brandId;
	private String brandName;
	
	public BrandEntity() {
		
	}
	
	public BrandEntity(int brandId, String brandName) {
		
		this.brandId = brandId;
		this.brandName = brandName;
	}
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
