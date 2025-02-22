package one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapPersonAndPanCard {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int pid = 4;
		int pcid = 8;
		
		Person p = em.find(Person.class, pid);
		Pancard pc = em.find(Pancard.class, pcid);
		
		p.setPc(pc);
		
		et.begin();
		em.merge(p);
		et.commit();
		
		System.out.println("Done");
	}
}
