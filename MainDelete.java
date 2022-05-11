package Problem2A;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainDelete 
{
		public static void main (String [] args)
		{
		//if a customer is deleted so is the corresponding professor
			SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Professor.class).
                addAnnotatedClass(Customer.class).
                buildSessionFactory();

			Session session = factory.getCurrentSession();

			try {

				session.beginTransaction();

				Professor delProfessor = session.get(Professor.class, 1);
				Customer delCustomer = session.get(Customer.class, 
												delProfessor.getCustomerDets().getCustomer_id());
				
				session.delete(delProfessor);
				session.delete(delCustomer);



				session.getTransaction().commit();


			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				factory.close();
			}
		}
}
