package org.divya.showroom.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "products")
@Table(name = "products")
public class ProductEntity {
	
	@Id
	@Column(name = "productId")
	private int productId;
	
	@ManyToOne
	@Column(name = "brandId")
	private int brandId;
	
	@Column(name = "productsName")
	private String productsName;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "cost")
	private String cost;
	
	
	public ProductEntity() {

	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getProductsName() {
		return productsName;
	}
	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

}
