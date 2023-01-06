package com.tus.webtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {

	@RequestMapping("/")
	public String index() {
		return "<h1 style='color:red'>Is working</h1><p>Products<p>";
	}
	
	@RequestMapping("/product/{id}")
	Product getProduct(@PathVariable("id") int id){
		return new Product(id);
	}

	@RequestMapping("/productIds")
	List<Integer> getProductIds(@RequestParam("id") int id){
		return Arrays.asList(id+1, id+2, id+3);
	}

	@RequestMapping("/applyDiscount")
	Product getDiscount(@RequestParam("id") int id,	@RequestParam("discount") int discount) {
		Product p = new Product(id);
		p.calculateDiscountedPrice(discount);
		return p;
	}

}
