package Problem2A;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreate 
{
	public static void main (String [] args) 
	{
			SessionFactory factory = new Configuration().
            configure("hibernate.cfg.xml").
            addAnnotatedClass(Customer.class).
            addAnnotatedClass(Professor.class).
            buildSessionFactory();
			Session session = factory.getCurrentSession();
			try 
			{
			
				
				session.beginTransaction();
		
				//create a professor that also has a customer_id associated with it
				Professor profe = new Professor ("A1","Algorithms");
				Customer customerProf = new Customer ("Robert", "123 USA");
				profe.setAsCustomer(customerProf);
				session.save(profe);
		
				session.getTransaction().commit();
				
			} 
			catch (Exception e) 
			{	
				System.out.println("IN CATCH");
				e.printStackTrace();
		
			} 
			finally 
			{
				factory.close();
			}
			System.out.println("Finished!");
	}
}
