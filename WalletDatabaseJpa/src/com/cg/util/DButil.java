package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DButil {
	
	static EntityManager em;
	
	static{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		em = factory.createEntityManager();
	}
	
	public static EntityManager getEntityManager(){
		return em;
	}

}
