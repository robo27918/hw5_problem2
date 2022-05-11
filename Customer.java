package Problem2A;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="address")	
	private String address;
	
	public Customer () {};
	
	public Customer (String customer_name, String address)
	{
		this.customer_name = customer_name;
		this.address = address;
	}
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	
}
