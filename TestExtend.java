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
}

class Student extends Person {
	private String school;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}

public class TestExtend {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ken");
		student.setAge(24);
		student.setSchool("HUST");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getSchool());	
	}
}
