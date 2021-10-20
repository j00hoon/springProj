package com.sb.test.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.test.domain.Product;

@RestController
@RequestMapping("/user")
public class userController 
{
	@RequestMapping("/{useridd}")
	public String displayUser(@PathVariable String useridd)
	{
		return "User id : " + useridd;
	}
	
	@RequestMapping("/{useridd}/invoices")
	public String displayUserInvoices(@PathVariable("useridd") String useridd, 
			@RequestParam(value="date", required=false) Date dateOrNull)
	{
		return "Invoice found user id : " + useridd + " on the date : " + dateOrNull;
	}
	
	@RequestMapping("/{userId}/items")
	public List<String> displayStringJson()
	{
		return Arrays.asList("Phone", "Laptop", "Gun");
	}
	
	@RequestMapping("/{userId}/products_as_json")
	public List<Product> displayProductsJson()
	{
		return Arrays.asList(new Product(1, "Xbox", 42.99), 
				new Product(2, "PS5", 99.99), 
				new Product(3, "Laptop", 142.99),
				new Product(4, "Mobilephone", 299.99));
	}
	
}






