public class EXM1 {
	public static void main(String[] arg) {
		int j = 3, num = 5;
		for (int i=1;i<100;i++) {
			if (i % j == 0 ) {
				num --;
				System.out.println(i);
			}
			if (num<1) break;
		}
	}
}