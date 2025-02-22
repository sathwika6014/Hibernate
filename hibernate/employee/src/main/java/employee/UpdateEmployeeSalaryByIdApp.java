package employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployeeSalaryByIdApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp=em.find(Employee.class,id);
		if(emp!=null) {
			System.out.println("Enter Updated salary");
			double salary=sc.nextDouble();
			emp.setSalary(salary);
			et.begin();
			em.merge(emp);
			et.commit();
			
		}
		
	}
}
