import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Student tempStudent= new  Student("rohit","sharma","rohit@gmail.com");
		session.save(tempStudent);
		session.getTransaction().commit();
	}

}
