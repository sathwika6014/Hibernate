package employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectEmployeeById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Employee emp = em.find(Employee.class, id);
		
		System.out.println(emp);
	}
}
