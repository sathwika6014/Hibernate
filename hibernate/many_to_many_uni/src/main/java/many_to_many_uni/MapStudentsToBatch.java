package many_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapStudentsToBatch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		int bid=2;
		int sid=5;
		Student s = em.find(Student.class, sid);
		Batch b = em.find(Batch.class, bid);
//		ArrayList<Student> list=new ArrayList<Student>();
//		list.add(s);
		List<Student> students = b.getStudents();
		students.add(s);
		et.begin();
		em.merge(b);
		et.commit();
	}
}
