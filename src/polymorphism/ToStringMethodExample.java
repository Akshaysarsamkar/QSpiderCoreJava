package polymorphism;

class Biodata {

	String name;
	String address;
	int age;
	double salary;

	public Biodata(String name, String address, int age, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Biodata [name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class ToStringMethodExample {
	public static void main(String[] args) {

		Biodata biodata = new Biodata("Akshay", "pune", 45, 25000);
		System.out.println(biodata); // before making toString Method return the ----->polymorphism.Biodata@e580929

	}
}
