public class TestThis {
	public static void main(String[] args) {
		Leaf leaf = new Leaf(100);
		leaf.increament().increament().print();
	}
}

class Leaf {
	int i = 0;
	Leaf(int i) {
		this.i = i;
	}
	Leaf increament() {
		i++;
		return this;
	}
	void print() { System.out.println("i =" + i); }
}
	