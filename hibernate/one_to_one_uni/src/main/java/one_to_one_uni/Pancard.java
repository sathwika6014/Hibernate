package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
	@GeneratedValue
	private int id;
	private String pNo;
	private int pinCode;
	
		
	public Pancard(int id, String pNo, int pinCode) {
		this.id = id;
		this.pNo = pNo;
		this.pinCode = pinCode;
	}
	
	public Pancard() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Pancard [id=" + id + ", pNo=" + pNo + ", pinCode=" + pinCode + "]";
	}
}
