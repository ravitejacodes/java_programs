import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpMainApp {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Employee tempemp= new Employee("anil","Banglore","anil@gmail.com");
		session.save(tempemp);
		session.getTransaction().commit();
	}

}
