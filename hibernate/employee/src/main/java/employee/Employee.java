package employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;
	private int dno;
	
	
	

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, int dno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dno = dno;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dno=" + dno + "]";
	}
}
