package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	
	@OneToOne
	private Pancard pc;

	public Person() {}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", pc=" + pc + "]";
	}

	public Person(int id, String name, String email, long phone, String password, Pancard pc) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.pc = pc;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Pancard getPc() {
		return pc;
	}

	public void setPc(Pancard pc) {
		this.pc = pc;
	}
	
}
