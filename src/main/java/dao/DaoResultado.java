package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Resultado;
import utils.JpaUtils;

public class DaoResultado {
	public static void create(Resultado p) {
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

	public static Resultado find(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Resultado p=null;
		try {
		p=em.find(Resultado.class, id);
		}catch (Exception e) {
			System.out.println("no se encontro" + e.getMessage());
		}finally {
			em.close();
		}
		return p;
	}

	public static void update(Resultado p) {
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
			Resultado p=em.find(Resultado.class, id);
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

