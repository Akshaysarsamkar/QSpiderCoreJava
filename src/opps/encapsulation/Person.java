package opps.encapsulation;

/*
 Implement a class Person with private attributes name, age, and email.
  Provide public methods to get and set these attributes, 
  ensuring that the email is validated before being set.

 */
public class Person {

	private String name;
	private int age;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email.contains("@"))
		    this.email = email;
		else {
			System.err.println("Enter correct Email");
		}
	}

}
