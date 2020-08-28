package org.divya.showroom.resources;


import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.divya.showroom.model.Brand;
import org.divya.showroom.model.Link;
import org.divya.showroom.services.BrandsService;


@Path("/showroom/brands")
public class BrandsResource {
	
	BrandsService service = new BrandsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Brand> getBrands() {
		List<Brand> list = service.getBrands();
		return list;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{brandId}")
	public Brand getBrand(@PathParam("brandId") int brandId, @Context UriInfo uri) {
		Link link = new Link(uri.getAbsolutePath().toString(), "self");
		
		Brand brand = service.getBrand(brandId);
		brand.setLinks(link);
		return brand;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postBrands(Brand brand, @Context UriInfo uri) {
		
		service.addBrand(brand);
		
//		String ResourceURL = uri.getAbsolutePath().toString() + "/" + brand.getBrandId();
//		URI location = URI.create(ResourceURL);

		URI location = uri.getAbsolutePathBuilder().path(Integer.toString(brand.getBrandId())).build();
		return Response.created(location).entity(brand).build();
				//status(Status.CREATED).entity(brand).build();
	}

	@PUT
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId") int brandId, Brand updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}
	
	@Path("/{brandId}/products")
	public ProductsResource productDelegation() {
		return new ProductsResource();
	}
	
}
