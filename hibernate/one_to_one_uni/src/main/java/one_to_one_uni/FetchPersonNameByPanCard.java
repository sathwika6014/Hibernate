package one_to_one_uni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonNameByPanCard {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Enter Pancard id to get Person name");
		int pcid = sc.nextInt();
		Pancard pc = em.find(Pancard.class, pcid);
		
		if(pc!=null)
		{
			Query q = em.createQuery("select p from Person p where p.pc.id = ?1");
			q.setParameter(1, pcid);
			List<Person> pl = q.getResultList();
			System.out.println(pl.getFirst().getName());
		}
//			List<Person> pl = q.getResultList();
//			for(Person p : pl)
//			{
//			     if(p.getPc().getId() == pcid)
//			     {
//			    	 System.out.println(p.getName());
//			     }
//			}
		else
		{
			System.out.println("Inavlid pancard id");
		}
		
//		int pid = 3;
//		Person p = em.find(Person.class, pid);
//		System.out.println(p.getPc().getpNo());
	}
}
