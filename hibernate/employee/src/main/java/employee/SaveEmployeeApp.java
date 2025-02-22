package employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		
		System.out.println("Enter dept no");
		int dno=sc.nextInt();
		
		Employee emp=new Employee(0,name,salary,dno);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(emp);
		
		et.commit();
		
		System.out.println("Done");
	}
}
