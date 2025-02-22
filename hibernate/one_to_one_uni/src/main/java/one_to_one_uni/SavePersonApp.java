package one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonApp {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person(0,"tara","tara@gmail.com",7305112411l,"124",null);
		
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Done");
	}
}
