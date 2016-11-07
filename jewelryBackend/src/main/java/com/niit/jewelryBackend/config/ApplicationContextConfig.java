package com.niit.jewelryBackend.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan("com.niit.jewelryBackend")
@EnableTransactionManagement
public class ApplicationContextConfig {
	@Bean(name="dataSource")
			public DataSource getH2DataSource()
			{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();

dataSource.setUrl("jdbc:h2:~/test");
dataSource.setDriverClassName("org.h2.Driver");
dataSource.setUsername("sa");
dataSource.setPassword("");
return dataSource;
}
private Properties getHibernateProperties()
{
	Properties properties = new Properties();
	properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	return properties;
}
	
    @Autowired
	@Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource)
    {
    	
		LocalSessionFactoryBuilder SessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	SessionBuilder.addProperties(getHibernateProperties());
    	return SessionBuilder.buildSessionFactory();
    }
    
   @Autowired
     @Bean(name= "transactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
return transactionManager;    
}
}