package many_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestCase2 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	    int sid=1;
	    Student s = em.find(Student.class,sid);
	    Query q = em.createQuery("from Batch");
	    List<Batch> ba=q.getResultList();
		for(Batch be:ba) {
			List<Student> students = be.getStudents();
			if(students.contains(s)) {
				System.out.println(be.getName());
			}
		}
	    
//	    Query q = em.createQuery("select b from  Batch b join b.students s where s.id=3");
//	    
//	    List<Batch> ba=q.getResultList();
//		for(Batch be:ba) {
//			System.out.println(be);
	    
	    
//	    System.out.println(s.getName());
//					
//		}
	}

}
