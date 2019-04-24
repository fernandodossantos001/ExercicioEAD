package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static EntityManagerFactory em;
	
	private EntityManagerFactorySingleton() {
		
	}
	
	public static EntityManagerFactory getInstance() {
		if(em == null) {
			em = Persistence.createEntityManagerFactory("");
		}
		
		return em;
	}

}
