package com.CustomerAcc;
import java.util.HashMap;
	import java.util.Map;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Environment;

	public class HibernateUutil {

	     static SessionFactory sf;	
	     
	     public static SessionFactory getSessionFactory() 
	     {
	    	 Map<String, Object> settings= new HashMap<String, Object>();
	    	 //connection mapping
	    	 settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
	    	 settings.put(Environment.URL, "jdbc:mysql://localhost:3306/CustomerAc");
	    	 settings.put(Environment.USER, "root");
	    	 settings.put(Environment.PASS, "root");
	    	 
	    	 //command mapping
	    	 settings.put(Environment.HBM2DDL_AUTO, "create");
	    	 settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL55Dialect");
	    	 settings.put(Environment.SHOW_SQL, "true");
	    //	 settings.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.EhCacheRegionFactory");
	   
	    	 StandardServiceRegistry registry= 
	    			          new StandardServiceRegistryBuilder().applySettings(settings).build();
	    	 
	    	 MetadataSources ms=new MetadataSources(registry)
	    			 .addAnnotatedClass(com.CustomerAcc.Customer.class)
	    			      	 .addAnnotatedClass(com.CustomerAcc.Account.class);

	    	 Metadata msd= ms.getMetadataBuilder().build(); 
	    	 
	    	 SessionFactory sf = msd.getSessionFactoryBuilder().build();
	    	 
	    	 return sf ;
	                                              
	    	 
	     }
												
	}





