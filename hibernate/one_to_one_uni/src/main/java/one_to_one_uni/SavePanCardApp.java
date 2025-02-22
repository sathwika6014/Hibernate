package one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePanCardApp {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Pancard pc = new Pancard(0, "QW123", 560043);
		
		et.begin();
		em.persist(pc);
		et.commit();
		
		System.out.println("Done");
	}
}
