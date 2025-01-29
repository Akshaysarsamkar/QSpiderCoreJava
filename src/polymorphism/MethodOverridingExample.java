package polymorphism;

class ApplictionFirst {

	public void oldVersion() {
		System.out.println("Old Version is 4 parent class");
	}

}

class UpdateApplication extends ApplictionFirst {

	@Override
	public void oldVersion() {
		System.out.println("Old version is 4 in child class");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {

		UpdateApplication application = new UpdateApplication();
		application.oldVersion();

		ApplictionFirst applictionFirst = application;
		applictionFirst.oldVersion();

		application = (UpdateApplication) applictionFirst;
		application.oldVersion();

	}

}
