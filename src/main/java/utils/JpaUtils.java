package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {

	private static final EntityManagerFactory emf;
	
	static {
		try{
			emf = Persistence.createEntityManagerFactory("Juego");
		}catch(Throwable ex) {
			System.out.println("La factoria no inicio " + ex.getMessage());
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}
}
