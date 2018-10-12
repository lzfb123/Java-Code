class Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getInfo() {
		return "Name:" + name + "\n" + "age:" + age;
	}
}

class Student extends Person {
	private String school;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getInfo() {
		return "Name:" + getName() + "\n" + "age:" + getAge() + "\nschool:" + school;
	}
	public String getInfo(int age) {
		return "Name:" + getName() + "\n" + "age:" + age + "\nschool:" + school;
	}
}

public class TestOverwrite {
	public static void main(String[] args) {
		Student student = new Student();
		Person person = new Person();
		student.setName("Ken");
		student.setAge(24);
		student.setSchool("HUST");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getSchool());	
		System.out.println(person.getInfo());
		System.out.println(student.getInfo());
		System.out.println(student.getInfo(3));
	}
	
}
