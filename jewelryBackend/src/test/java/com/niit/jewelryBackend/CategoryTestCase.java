package com.niit.jewelryBackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.jewelryBackend.dao.Categorydao;
import com.niit.jewelryBackend.model.Category;




public class CategoryTestCase {

@Autowired
 static AnnotationConfigApplicationContext context;
	@Autowired
	static Category category;
	@Autowired
	static Categorydao categorydao;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.jewelryBackend");
		context.refresh();
		 categorydao = (Categorydao) context.getBean("categorydao");
		category = (Category) context.getBean("category");
	}
	
	@Test
	public void CreateCategoryTestCase()
	{
		
		category.setId("002");
        category.setDescription("this is appliances category");
        category.setName("appliances category");
        
        Assert.assertEquals("create category test case", true, categorydao.save(category));
	
	}
	
	@Test
	public void updateCategoryTestCase()
	{
		
		category.setId("001");
        category.setDescription("this is appliances category");
        category.setName("category");
        
        Assert.assertEquals("create category test case", true, categorydao.update(category));
	
	}
	@Test
	public void deleteCategoryTestCase()
	{
		category.setId("002");
		 Assert.assertEquals("create category test case", true, categorydao.delete(category));
		
	}
}
