public class TEST {
	public static void main(String[] args) {
		Person person = new Person();
		person.show();
	}
}

class Person {
	int age;
	String name;
	//Person(){};	
	void show() {
		System.out.println("age=" + age);
		System.out.println("name=" + name);
}