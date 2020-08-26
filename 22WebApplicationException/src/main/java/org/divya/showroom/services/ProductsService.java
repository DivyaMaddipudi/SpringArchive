package org.divya.showroom.services;

import java.util.List;

import org.divya.showroom.DAO.ProductsDAO;
import org.divya.showroom.model.Product;

public class ProductsService {

	ProductsDAO productsDAO = new ProductsDAO();
	
	public List<Product> getProductsByBrand(int brandId) {

		List<Product> productList = productsDAO.getProductsByBrand(brandId);
		return productList;
	}

	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		List<Product> productList = productsDAO.getProductsByBrandAndCategory(brandId, category);
		return productList;
	}

}
