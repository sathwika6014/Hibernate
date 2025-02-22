package one_to_many_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProduct {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		System.out.println("Enter Brand");
		String brand = sc.next();
		
		Product p=new Product(0,name,price,brand);
		
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Done");
	}
}
