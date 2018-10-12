public class TestStatic {
	public static void main(String[] args) {
		Cat.sid = 100;
		Cat mimi = new Cat("mimi");
		Cat pipi = new Cat("pipi");
		mimi.info();
		pipi.info();
	}
}

class Cat {
	static int sid = 0;
	int _sid = 100;              
	String name;
	int id, _id;
	Cat(String name) {
		this.name = name;
		id = sid++;
		_id = _sid++;
	}
	void info() {
		System.out.println("My name is" + name + "No." + id +"No." + _id);
	}
}