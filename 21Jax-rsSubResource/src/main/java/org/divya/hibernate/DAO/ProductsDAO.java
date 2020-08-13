package org.divya.hibernate.DAO;

import java.util.List;

import org.divya.showroom.hibernate.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(ProductEntity.class)
								.buildSessionFactory();

	public List<ProductEntity> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String sql = "from products where brandId = '"+brandId+"'";
		productList = session.createQuery(sql).getResultList();
		return productList;
	}

}
