package one_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapProductsToCard {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int cid = 7;
		
		int pid1 = 9;
//		int pid2 = 5;
//		int pid3 = 6;
		
		Cart c = em.find(Cart.class, cid);
		
		Product p1 = em.find(Product.class, pid1);
//		Product p2 = em.find(Product.class, pid2);
//		Product p3 = em.find(Product.class, pid3);
		
	    List<Product> products = c.getProducts();	
	    
	    products.add(p1);
//	    products.add(p2);
//	    products.add(p3);
	    
	    et.begin();
	    em.merge(c);
	    et.commit();
	    System.out.println("Done");
	}
}
