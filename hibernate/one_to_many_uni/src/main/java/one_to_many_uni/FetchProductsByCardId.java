package one_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchProductsByCardId {
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int cid = 7;
		Cart c = em.find(Cart.class, cid);
		System.out.println(c.getName());
		System.out.println(c.getProducts().size());
		
		List<Product> products = c.getProducts();
		for(Product p : products)
		{
			System.out.println(p);
		}
	}
}
