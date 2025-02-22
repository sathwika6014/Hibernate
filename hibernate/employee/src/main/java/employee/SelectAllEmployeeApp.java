package employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectAllEmployeeApp {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from Employee");
		List<Employee> el = q.getResultList();
		for (Employee emp : el) {
			System.out.println(emp);
		}
	}
}
