public class TestMethod_2 {
	public static void main(String[] args){
		Person A = new Person(10001,24,1,"ken");
		A.show();
		A.setage(25);
		A.show();
	}
}

class Person {
	int age = 0, sex = 1, id = 0;
	String name = "none";
	
	Person(int _id,int _age, int _sex, String _name) {
		id = _id; age = _age; sex = _sex; name = _name;
	}
	
	void show() {
		System.out.println("id:" + id);
		System.out.println("age:" + age);
		System.out.println("sex:" + sex);
		System.out.println("name:" + name);
	}
	
	void setage(int _age) {
		age = _age;
	}
	
	void setsex(int _sex) {
		sex = _sex;
	}
	
	void setname(String _name) {
		name = _name;
	}
}
		
		