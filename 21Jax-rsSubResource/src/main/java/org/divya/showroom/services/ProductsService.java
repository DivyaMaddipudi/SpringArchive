package org.divya.showroom.services;

import java.util.List;

import org.divya.hibernate.DAO.ProductsDAO;
import org.divya.showroom.hibernate.entity.ProductEntity;

public class ProductsService {

	ProductsDAO productsDAO = new ProductsDAO();
	
	public List<ProductEntity> getProductsByBrand(int brandId) {

		List<ProductEntity> productList = productsDAO.getProductsByBrand(brandId);
		return productList;
	}

}
