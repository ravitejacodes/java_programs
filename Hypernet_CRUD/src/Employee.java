import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")// name of the table

public class Employee{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")//(id is column name of table)
	private int id;
	@Column(name="name")//(name is column name of table)
	private String name;
	@Column(name="city")//(city is column name of table)
	private String city;
	@Column(name="email")//(email is column name of table)
	private String email;
	public Employee() {
		super();
	}
	public Employee(String name, String city, String email) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString(){
		return "Employee [id=" + id + " , name= " + name + ", city= " + city + ", email= " + email + "]";
	}
	

}
