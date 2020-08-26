package org.divya.showroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "products")
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private int productId;
	
	@ManyToOne(targetEntity = Brand.class)
	@JoinColumn(name = "brandId")
	Brand brandEntity;
	
	
	@Column(name = "productsName")
	private String productsName;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "cost")
	private String cost;
	
	
	public Product() {

	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public Brand getBrandEntity() {
		return brandEntity;
	}

	public void setBrandEntity(Brand brandEntity) {
		this.brandEntity = brandEntity;
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
