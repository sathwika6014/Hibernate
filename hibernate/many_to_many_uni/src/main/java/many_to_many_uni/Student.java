package many_to_many_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phno;
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String email, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student that = (Student) obj;
		return this.id == that.id;
	}
}
