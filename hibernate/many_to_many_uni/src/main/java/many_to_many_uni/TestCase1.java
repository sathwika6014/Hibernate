package many_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCase1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em1=emf.createEntityManager();
		EntityManager em2=emf.createEntityManager();
		EntityManager em3=emf.createEntityManager();
		EntityManager em4=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		int bid=1;
//		Batch b = em.find(Batch.class, bid);
//		System.out.println(b.getName());
//		List<Student> stu=em.getResultList();
		em1.find(Batch.class,1);
		em2.find(Batch.class,2);
		em3.find(Batch.class,3);
		em4.find(Batch.class,1);
		}
}
