package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Match {

	public static void main(String[] args) {
		
		// AnyMatch
		Stream<String> stream = Stream.of("one", "two", "three", "four");
		boolean match = stream.anyMatch(s -> s.contains("four"));
		System.out.println(match);
		
		// AllMatch
		Stream<String> stream2 = Stream.of("one", "two", "three", "four");
		Predicate<String> containsDigit = s -> s.contains("\\d+") == false;
		boolean match2 = stream2.allMatch(containsDigit);
		System.out.println(match2);
		
		// NoneMatch
		Stream<String> stream3 = Stream.of("one", "two", "three", "four");
		boolean match3 = stream3.noneMatch( s -> s.contains("\\d+") );
		System.out.println(match3);
		
		// AnyMatch - AllMatch
		Predicate<Employee2> olderThan50 = e -> e.getAge() > 50;
	    Predicate<Employee2> earningMoreThan40K = e -> e.getSalary() > 40_000;
	    Predicate<Employee2> combinedCondition = olderThan50.and(earningMoreThan40K);
	     
	    boolean result = getEmployeeStream().anyMatch(combinedCondition);
	    System.out.println(result);
	    
	    boolean result2 = getEmployeeStream().allMatch(combinedCondition);
	    System.out.println(result2);
	}
	
	private static Stream<Employee2> getEmployeeStream() {
	    List<Employee2> empList = new ArrayList<>();
	    empList.add(new Employee2(1, "A", 46, 30000.0));
	    empList.add(new Employee2(2, "B", 56, 30000.0));
	    empList.add(new Employee2(3, "C", 42, 50000.0));
	    empList.add(new Employee2(4, "D", 52, 50000.0));
	    empList.add(new Employee2(5, "E", 32, 80000.0));
	    empList.add(new Employee2(6, "F", 72, 80000.0));
	     
	    return empList.stream();
	  }
}

class Employee2 {
	private long id;
	private String name;
	private int age;
	private double salary;

	public Employee2(long id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}