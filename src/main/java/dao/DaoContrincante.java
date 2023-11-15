package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Contrincante;
import utils.JpaUtils;

public class DaoContrincante {

	public static void create(Contrincante p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();
		try {
		em.persist(p); // hacer el insert
		em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback(); // retroceso, no hace cambios
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		
	}

	public static Contrincante find(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Contrincante p=null;
		try {
		p=em.find(Contrincante.class, id);
		}catch (Exception e) {
			System.out.println("no se encontro" + e.getMessage());
		}finally {
			em.close();
		}
		return p;
	}

	public static void update(Contrincante p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		try {
			em.merge(p); // hace el update
			tx.commit();
			System.out.println("exito en la actualizacion");
		} catch (Exception e) {
			tx.rollback(); // retroceso, no hace cambios
			System.out.println("no se pudo modificar " + e.getMessage());
		} finally {
			em.close();
		}
		
		
	}

	public static void delete(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();
		try {
			Contrincante p=em.find(Contrincante.class, id);
			em.remove(p); // Delete * from personas where personas.id= id
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback(); // retroceso, no hace cambios
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}
}
