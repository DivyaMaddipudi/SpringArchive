package org.divya.showroom.DAO;

import java.util.List;

import org.divya.showroom.model.Brand;
import org.divya.showroom.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Brand.class)
								.buildSessionFactory();

	public List<Product> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL = "from products where brandId = '"+brandId+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}

	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL = "from products where brandId = '"+brandId+"' and category='" +category+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}

}
