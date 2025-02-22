package one_to_many_uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany
	private List<Product> products;

	public Cart() {}

	public Cart(int id, String name, List<Product> products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
}
