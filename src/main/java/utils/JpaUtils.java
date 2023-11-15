package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static final EntityManagerFactory emf;
	
	static {
		try {
			emf =  Persistence.createEntityManagerFactory("Game");
		}catch(Throwable ex) {
			System.out.println("el juego no inicio" + ex.getMessage());
			throw new ExceptionInInitializerError();
		}	
		
	}
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}
}
