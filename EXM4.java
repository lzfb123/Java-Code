class A {
	protected void print(String s) {
		System.out.println(s);
	}
	A() { print("A()"); }
	public void f() { print("A:f()"); }
}

class B extends A {
	B() { print("B()"); }
	public void f() { print("B:f()"); }
}

public class EXM4 {
	public static void main(String[] args) {
		B b =new B();
		b.f();
	}
}
