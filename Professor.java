package Problem2A;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="professor_id")
	private int professor_id;
	

	@Column(name="office_number")
	private String office_number;
	
	@Column(name="research_area")	
	private String research_area;
	

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer_id;
	
	public Professor () {}
	
	public Professor (String office_number, String research_area)
	{
		this.office_number = office_number;
		this.research_area = research_area;
		//this.customer_id = customer_id;
	}

	public int getProfessor_id() {
		return professor_id;
	}

	public void setProfessor_id(int professor_id) {
		this.professor_id = professor_id;
	}

	public String getOffice_number() {
		return office_number;
	}

	public void setOffice_number(String office_number) {
		this.office_number = office_number;
	}

	public String getResearch_area() {
		return research_area;
	}

	public void setResearch_area(String research_area) {
		this.research_area = research_area;
	}
	/*
	public int getCustomer_id() {
		return customer_id;
	}
*/
	public void setCustomer_id(Customer customer) {
		//this.customer_id = customer_id.getCustomer_id();
	}
	
	public void setAsCustomer (Customer customer)
	{
		this.customer_id = customer;
		
	}
	public Customer getCustomerDets ()
	{
		return this.customer_id;
	}
	
}
