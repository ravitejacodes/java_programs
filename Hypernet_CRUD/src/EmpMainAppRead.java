import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpMainAppRead {
	 public static void main(String[] args) {
		SessionFactory factory= new Configuration()
								.configure("hibernate.cgf.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		Session  session =factory.getCurrentSession();
		
		session.beginTransaction();
		List<Employee> tempEmp =session.createQuery("from Employee").list();
		
		for(Employee e:tempEmp) {
			System.out.println(e);
		}
		session.getTransaction();
	}
}
