
class Point {
	private double x;
	private double y;
	Point(double x1, double y1) {
		x = x1;
		y = y1;
	}
	public double getX() { return x; }
	public double getY() { return y; }
	public void setX(double i) { x = i; }
	public void setY(double i) { y = i; }
	public void get() {
		System.out.println("("+ x + "," + y + ")");
	}
	public double getDis(Point p) {
		double x = p.x - this.x;
		double y = p.y - this.y;
		return x * x + y * y;
	}
}

class Circle extends Point {
	private double radius;
	Circle(double x, double y, double r) {
		super(x,y);
		radius = r;
	}
	Circle(double r) {
		super(0.0, 0.0);
		radius = r;
	}
	
	public void get() {
		super.get();
		System.out.println("r = " + radius);
	}
	
	boolean contains(Point p) {
		double d = super.getDis(p);
		if(radius * radius < d ) return false;
		else return true;
	}	

	public double getRadius() { return radius; }
	
	public void setRadius(double r) { radius = r; }
	
	public double area() {
		return 3.14 * radius * radius;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.0, 2.0, 2.0);
		Circle c2 = new Circle(5.0);
		c1.get();
		c2.get();
		System.out.println("c1 area =" + c1.area());
		System.out.println("c2 area =" + c2.area());
		c1.setX(5); c1.setY(6);
		c2.setRadius(9.0);
		c1.get();
		c2.get();
		System.out.println("c1 area =" + c1.area());
		System.out.println("c2 area =" + c2.area());
		Point p1 = new Point(5.2, 6.3);
		System.out.println(c1.contains(p1));
		System.out.println(c1.contains(new Point(10.0, 9.0)));
	}
}


