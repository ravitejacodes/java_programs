import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainAppRead {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		List <Student> tempStudents = session.createQuery("from Student").list();
		
		for(Student x:tempStudents) {
			System.out.println(x);
		}
		session.getTransaction();
	
	}

}
