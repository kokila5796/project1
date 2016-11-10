package com.niit.jewelryBackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.jewelryBackend.dao.Supplierdao;
import com.niit.jewelryBackend.model.Supplier;


public class SupplierTestCase {
	@Autowired
	 static AnnotationConfigApplicationContext context;
		@Autowired
		static Supplier supplier;
		@Autowired
		static Supplierdao supplierdao;
		
		@BeforeClass
		public static void init()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.jewelryBackend");
			context.refresh();
			 supplierdao = (Supplierdao) context.getBean("supplierdao");
			supplier = (Supplier) context.getBean("supplier");
		}
		
		@Test
		public void createSupplierTestCase()
		{
			
			supplier.setSup_id("Sup 109");
	       supplier.setName("supplier");
	        supplier.setAddress("porur");
	        
	        Assert.assertEquals("create supplier test case", true, supplierdao.save(supplier));
		
		}
		
		@Test
		public void updateSupplierTestCase()
		{
			
			supplier.setSup_id("Sup 103");
	        supplier.setAddress("chennai");
	        supplier.setName("supplier");
	        
	        Assert.assertEquals(" supplier ", true, supplierdao.update(supplier));
		
		}
		

}
