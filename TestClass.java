public class TestClass {
	
	
	public static void main(String[] args) {
		Person A = new Person(33, "Ken", 24, 1);
		A.show();
		A.setage(25);
		A.setname("YXK");
		A.show();
	}	
} 
class Person {
		private  int id;
		private  int age;
		private  String name;
		private int sex;
		
		Person(int _id, String _name ,int _age, int _sex) {
			id = _id;
			name = _name;
			age = _age;
			sex = _sex;
		}
		
		public void show() {
			System.out.println("id :" + id);
			System.out.println("name :" + name);
			System.out.println("age :" + age);
			System.out.println("sex :" + sex);
		}
		
		public void setage(int _age) {
			age = _age;
		}
		
		public void setname(String _name) {
			name = _name;
		}
}