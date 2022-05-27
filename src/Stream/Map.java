package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		// Map String to Integer
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(listOfIntegers);

		// Map Custom
		List<Employee> employeesList = Arrays.asList(
				new Employee(1, "Alex", 100), 
				new Employee(2, "Brian", 100),
				new Employee(3, "Charles", 200), 
				new Employee(4, "David", 200), 
				new Employee(5, "Edward", 300),
				new Employee(6, "Frank", 300));
		List<Integer> distinctSalaries = employeesList.stream().map(e -> e.getSalary()).distinct().collect(Collectors.toList());
		System.out.println(distinctSalaries);
		
		// Collectors.toMap
		java.util.Map<Integer, Employee> employeesMap = employeesList.stream().collect( Collectors.toMap(Employee::getId, Function.identity()));
		System.out.println(employeesMap);
		
		// Collectors.groupingBy
        java.util.Map<String, List<Employee>> employeesMap2 = employeesList.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(employeesMap2);

System.out.println(employeesMap);

		// FlatMap List to List
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(listOfAllIntegers);
		
		// FlatMap Array to List
		String[][] dataArray = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" }, { "g", "h" } };
		List<String> listOfAllChars = Arrays.stream(dataArray).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
		System.out.println(listOfAllChars);
	}
}

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}