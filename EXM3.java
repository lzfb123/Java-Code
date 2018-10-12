public class EXM3 {
	public static void main(String[] args) {
		Point a = new Point(4.0,5.0,6.0);
		a.set_x(8);
		System.out.println(a.distance(new Point(9,6,4)));
	}
}

class Point {
	double x = 0f, y = 0f, z = 0f, dis = 0f;
	
	Point(double _x,double _y,double _z) {
		x = _x; y = _y; z = _z;
	}
	
	void set_x(double _x) {
		x = _x;
	}
	void set_y(double _y) {
		y = _y;
	}
	void set_z(double _z) {
		z = _z;
	}
	
	double distance(Point p) {
		return dis = (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z);
	}
}