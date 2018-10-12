public class Testlogic {
	public static void main(String[] arg) {
		boolean a,b,c;
		a = true; b = false;
		c = a & b; System.out.println(c);
		c = a | b; System.out.println(c);
		c = a ^ b; System.out.println(c);
		c = !a; System.out.println(c);
		c = a && b; System.out.println(c);
		c = a || b; System.out.println(c);
		int i = 1, j = 2;
		boolean flag1 = (i>3) && ((++i)>5); //第二个操作数将不再计算//
		System.out.println(i);
		boolean flag2 = (i>3) & ((++i)>5);
		System.out.println(i);
		boolean flag3 = (i<3) || ((++j)<6);  //第二个操作数将不再计算//
		System.out.println(j);
	}
}