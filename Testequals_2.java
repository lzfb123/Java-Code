public class Testequals_2 {
	public static void main(String[] args) {
		Dog d1 = new Dog(1,2,3);
		Dog d2 = new Dog(1,2,3);
		System.out.println(d1.equals(d2));
		System.out.println("d1 = " + d1);
	}
}

class Dog {
	private int color;
	private int weight, height;
	public Dog(int color, int weight, int height) {
		this.color = color;
		this.weight = weight;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else {
			if(obj instanceof Dog) {
				Dog d = (Dog)obj;
				if(this.color == d.color && this.weight == d.weight && this.height == d.height)
					return true;
				else return false;
			}
			else return false;
		}
	}
	
	public String toString() {
		return "I am a cooooool dog!!!";
	}
}