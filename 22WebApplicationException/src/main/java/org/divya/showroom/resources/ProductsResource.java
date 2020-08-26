package org.divya.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.divya.showroom.model.Product;
import org.divya.showroom.services.ProductsService;

//@Path("/showroom/brands")
public class ProductsResource {
	
	ProductsService productService = new ProductsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathParam("brandId") int brandId, @QueryParam("category") String category, @QueryParam("start") int start, @QueryParam("end") int end) {
		
		List<Product> productlist;
		if(category != null) {
			productlist = productService.getProductsByBrandAndCategory(brandId, category);
		
		} else {
			productlist = productService.getProductsByBrand(brandId);
			
		}
		if(end > 0) {
			productlist = productlist.subList(start, end);
		}
		return productlist;
	}
}
