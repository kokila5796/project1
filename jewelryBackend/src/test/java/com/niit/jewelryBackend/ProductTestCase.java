package com.niit.jewelryBackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.jewelryBackend.dao.Productdao;
import com.niit.jewelryBackend.model.Product;
public class ProductTestCase {

		@Autowired
		 static AnnotationConfigApplicationContext context;
			@Autowired
			static Product product;
			@Autowired
			static Productdao productdao;
			
			@BeforeClass
			public static void init()
			{
				context = new AnnotationConfigApplicationContext();
				context.scan("com.niit.jewelryBackend");
				context.refresh();
				productdao = (Productdao) context.getBean("productdao");
				product = (Product) context.getBean("product");
			}
			
			@Test
			public void CreateProductTestCase()
			{
				
				product.setId("002");
				
				product.setName("appliances product");
		        
		        Assert.assertEquals("create category test case", true, productdao.save(product));
			
			}
			
			@Test
			public void updateProductTestCase()
			{
				
				product.setId("001");
				
				product.setName("product");
				product.getPrice();
				product.setCategory_id("002");
				product.setSupplier_id(null);
		        
		        Assert.assertEquals("create category test case", true, productdao.update(product));
			
			}
			

}
