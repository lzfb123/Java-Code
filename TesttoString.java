public class TesttoString {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println("d:=" + d);
	}
}

class Dog {
	public String toString() {
		return "I am a cool dog!";
	}
}