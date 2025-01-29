package array;

import java.util.Arrays;

class Employee implements Comparable {

	String name;
	int age;
	float salary;
	int id;

	public Employee(String name, int age, float salary, int id) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.id = id;
	}

	@Override
	public int compareTo(Object o) {

		Employee employee = (Employee) o;

		if (this.salary > employee.salary) {
			return 1;
		} else if (this.salary < employee.salary) {
			return -1;
		} else {
			return 0;
		}
	}
	
	

}

public class SortArrayUsingBuildMethod {

	public static void main(String[] args) {

		Employee e[] = new Employee[5];

		e[0] = new Employee("Akshay", 78, 58000f, 1);

		e[1] = new Employee("karan", 48, 78000f, 5);

		e[2] = new Employee("Ramesh", 26, 63000f, 4);

		e[3] = new Employee("Suresh", 36, 25800, 2);

		e[4] = new Employee("rajesh", 65, 80000f, 3);

		Arrays.sort(e);
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].salary);
		}
	}

}
