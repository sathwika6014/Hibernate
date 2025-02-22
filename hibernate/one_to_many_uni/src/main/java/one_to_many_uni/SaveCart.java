package one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCart {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Cart c = new Cart(0, "AMAZON", null);
		
		et.begin();
		em.persist(c);
		et.commit();
		System.out.println("Done");
	}
}
