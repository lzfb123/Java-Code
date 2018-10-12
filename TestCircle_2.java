class Point {
	private double x;
	private double y;
	Point(double x1, double y1) {
		x = x1;
		y = y1;
	}
	public void setX(double x1) { x = x1; }
	public void setY(double y1) { y = y1; }
	public double getX() { return x; }
	public double getY() { return y; }
}

class Circle {
	private Point o;
	private double radius;
	Circle(Point p, double r) {
		o = p;
		radius = r;
	}
	Circle(double r) {
		o = new Point(0,0);
		radius = r;
	}
	
	public void setO(double x, double y) {
		o.setX(x);
		o.setY(y);
	}
	public void setR(double r) {
		radius = r;
	}
	public Point getO() { return o; }
	public double getR() {return radius; }
	public void getCircle() {
		System.out.println("o:(" + o.getX() + "," + o.getY() + "); r = " + radius);
	}
	public double area() { return 3.14 * radius * radius; }
	public boolean contains(Point p) {
		double x1 = (o.getX() - p.getX()) * (o.getX() - p.getX());
		double y1 = (o.getY() - p.getY()) * (o.getY() - p.getY());
		if(x1+y1 < radius*radius) return true;
		else return false;
	}
}

public class TestCircle_2 {
	public static void main(String[] args) {                              //别忘了打main方法！！！//
		Circle c1 = new Circle(new Point(2.0,3.0), 3.0);
		Circle c2 = new Circle(5.0);
		c1.getCircle();
		c2.getCircle();
		System.out.println(c1.area());
		System.out.println(c2.area());
		c1.setO(6.0,5.0);
		c1.setR(7.0);
		c1.getCircle();
		System.out.println(c1.contains(new Point(18,90)));
		Point p = new Point(6.0,5.5);
		System.out.println(c1.contains(new Point(18,90)));
	}
}
 