package employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAllApp {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp=em.find(Employee.class,id);
		
		if(emp!=null) {
			boolean flag=true;
			while(flag) {
				System.out.println("Select Options");
				System.out.println("1) update name");
				System.out.println("2) update salary");
				System.out.println("3) update deptno");
				System.out.println("4) Exit");
				int key=sc.nextInt();
				switch (key) {
				case 1:{
					System.out.println("Enter New Name");
					String nm=sc.next();
				    emp.setName(nm);
					et.begin();
					em.merge(emp);
					et.commit();
				}
					
					break;
				case 2:{
					System.out.println("Enter New Salary");
					double sal=sc.nextDouble();
				    emp.setSalary(sal);
					et.begin();
					em.merge(emp);
					et.commit();
					
				}
				break;
				case 3:{
					System.out.println("Enter New Dept No");
					int dno=sc.nextInt();
				    emp.setDno(dno);
					et.begin();
					em.merge(emp);
					et.commit();
					
				}
				break;
				case 4:{
					flag =false;
				}
				break;
				
				default:System.out.println("Incorrect option");
					break;
				}
			}
				
				
		}
			
		else {
			System.out.println("Invalid Employee Id");
		}
		}
		
		
	}

}
