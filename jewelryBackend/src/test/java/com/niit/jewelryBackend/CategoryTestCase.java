package com.niit.jewelryBackend;

import static org.junit.Assert.*;

import java.util.Locale.Category;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

@Autowired
 static AnnotationConfigApplicationContext context;
	@Autowired
	static Category category;
	@Autowired
	static Categorydao categorydao;
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.jewelryBackend");
		context.refresh();
		categorydao =(Categorydao) context.getBean("categorydao");
		category = (Category) context.getBean("category");
	}
	
	
	}


