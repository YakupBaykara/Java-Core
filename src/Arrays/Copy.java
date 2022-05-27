package Arrays;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.lang3.SerializationUtils;

public class Copy {

	public static void main(String[] args) {
		
		Employee[] empArray = new Employee[2];
		empArray[0] = new Employee(100, "Lokesh", "Gupta", new Department(1, "HR"));
		empArray[1] = new Employee(200, "Pankaj", "Kumar", new Department(2, "Finance"));

		// SerializationUtils.clone metodu ile. Kopyalanan yeni dizi de değişiklik olmazken asıl dizi değişiyor. 
		// Sınıflar Serialization ı implemente etmeli
		Employee[] copiedArray = SerializationUtils.clone(empArray); // Deep copied array
		empArray[0].setFirstName("Unknown");
		empArray[0].getDepartment().setName("Unknown");
		
		System.out.println(empArray[0].getFirstName()); // Unknown
		System.out.println(empArray[0].getDepartment().getName()); // Unknown
		System.out.println(copiedArray[0].getFirstName()); // Lokesh
		System.out.println(copiedArray[0].getDepartment().getName()); // HR
		
		// Arrays.clone metodu ile 
		String[] names = {"Alex", "Brian", "Charles", "David"};
		String[] cloneOfNames = names.clone();		 
		System.out.println(Arrays.toString(names));     
		System.out.println(Arrays.toString(cloneOfNames));
		
		// Arrays.copyOf metodu ile
		String[] copyOfNames = Arrays.copyOf(names, names.length);		 
		System.out.println(Arrays.toString(names));   
		System.out.println(Arrays.toString(copyOfNames));   
		
		// System.carrayCopy metodu ile
		String[] copyOfNames2 = new String[names.length];
		System.arraycopy(names, 0, copyOfNames2, 0, copyOfNames2.length);		 
		System.out.println(Arrays.toString(names));     
		System.out.println(Arrays.toString(copyOfNames)); 
		
		// Arrays.copyOfRange metodu ile
		String[] partialNames = Arrays.copyOfRange(names, 0, 2);	 
		System.out.println(Arrays.toString(partialNames));
		String[] endNames = Arrays.copyOfRange(names, 2, names.length); 
		System.out.println(Arrays.toString(endNames)); 
		String[] moreNames = Arrays.copyOfRange(names, 2, 10);
		System.out.println(Arrays.toString(moreNames));		
	}
}

class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Department department;

	public Employee(Integer id, String firstName, String lastName, Department department) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}
}

class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Integer id;
	String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
