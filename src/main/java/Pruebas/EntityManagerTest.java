package Pruebas;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.Categoria;



public class EntityManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertar();

	}
	
	private static void insertar() {
		EntityManager em = Persistence.createEntityManagerFactory("MiChaucherita2").createEntityManager();
		
		Categoria cat1 = new Categoria("Sueldo nómina", "Ingreso");
		
		em.getTransaction().begin();
		em.persist(cat1);
		em.getTransaction().commit();
	}

}
