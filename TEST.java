public class TEST {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.show());
		Person person1 = new Person(20,"adasd");
		person1.show();
		Person person2 = new Person(20);
		person2.show();
	}
}
class Person {
	int age;
	String name;
	Person(){age = 0; name = "null"};	
	Person(int i, String a){
		age = i;
		name = a;
	};	
	Person(int i){
		age = i;
	}
	int show() {
		return age;
	}
}


