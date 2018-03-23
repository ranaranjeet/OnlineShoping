package com.cusat.O_shoping.Resources;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.O_shoping.model.Product;
import com.cusat.O_shoping.persistence.ProductDao;

public class ProductResource {
ProductDao productdao;
	
	@Inject
	public ProductResource(ProductDao productdao) {
		this.productdao=productdao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Product> getproduct() {
		List<Product> product =productdao.findAll();
		return product;
	}@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Product save(@Valid Product product) {
        return productdao.save(product);
    }
}
