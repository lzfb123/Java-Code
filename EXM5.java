class Person {
	private String name;
	private String location;
	
	Person(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	Person(String name) {
		this.name = name;
		location = "beijing";
	}
	
	public String info() {
		return "name:" + name + "location:" + location;
	}		
}

class Student extends Person   {
	private String school;
	Student(String name, String school) {
		this(name, "beijing", school);
	}
	
	Student(String n, String l, String school) {
		super(n,l);
		this.school = school;
	}
	
	public String info() {
		return super.info() + "school:" + school;
	}
}

class Teacher extends Person {
	private String capital;
	Teacher(String name, String capital) {
		this(name, "beijing", capital);
	}
	
	Teacher(String n, String l, String capital) {
		super(n,l);
		this.capital = capital;
	}
		
	public String info() {
		return super.info() + "capital:" + capital;
	}
}

public class EXM5 {
	public static void main(String[] args) {
		Person p1 = new Person("A");
		Person p2 = new Person("B", "shanghai");
		Student s1 = new Student("c", "S1");
		Student s2 = new Student("C", "shanghai", "S2");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}

