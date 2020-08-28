package org.divya.showroom.services;

import java.util.List;

import org.divya.showroom.DAO.BrandsDAO;
import org.divya.showroom.model.Brand;

public class BrandsService {
	
	BrandsDAO DAO = new BrandsDAO();

	public List<Brand> getBrands() {
		
		List<Brand> list = DAO.getBrands();
		return list;
	}

	public void addBrand(Brand brand) {
		DAO.addBrand(brand);
		
		
	}

	public void updateBrand(Brand updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		DAO.deleteBrand(brandId);
		
	}

	public Brand getBrand(int brandId) {
		Brand brand = DAO.getBrand(brandId);
		System.out.println("sev" + brandId);
		return brand;
	}

}
