import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainAppUpadate {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Student tempStudent=(Student) session.get(Student.class, 1);
		tempStudent.setEmail("vk@gmail.com");
		session.update(tempStudent);
		session.getTransaction().commit();
		

	}

}
