class SuperClass {
	private int n;
	SuperClass() {
		System.out.println("SuperClass()");
	}
	SuperClass(int n) {
		this.n = n;
		System.out.println("SuperClass(" + n + ")");
	}
	
	public void print() { System.out.println(n); }
}

class SubClass extends SuperClass {
	private int n;
	SubClass() {
		System.out.println("SubClass()");
	}
	SubClass(int n) {
		super(n);
		this.n = n;
		System.out.println("SubClass(" + n + ")");
	}
	public void print() {
		super.print();
		System.out.println(n);
	}
}

public class TestSupersub_2 {
	public static void main(String[] args) {
		SubClass sub1 = new SubClass();
		SubClass sub2 = new SubClass(300);
		sub1.print();
		sub2.print();
	}
}