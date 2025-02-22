package one_to_one_uni;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPersons {
	
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p");
		
		List<Person> persons = q.getResultList();
		
		for(Person p : persons)
		{
			System.out.println(p);
		}
		
		/*
		 for(Person p : (List<Person>) em.createQuery("from Person").getResultList())
		 {
		     System.out.println(p);
		 }
	   */
	}
}
