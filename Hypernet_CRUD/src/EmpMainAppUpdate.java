import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpMainAppUpdate {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		Employee tempEmp =(Employee) session.get(Employee.class, 2);
		tempEmp.setEmail("anilkumar@gmail.com");
		session.update(tempEmp);
		session.getTransaction().commit();
		
		
								
	}

}
