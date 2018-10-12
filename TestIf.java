public class TestIf {
	public static void main(String[] arg) {
		int i = 20;
		if (i < 20) {
			System.out.println("i<20");
		} 
		else {
			System.out.println("i>=20");
			if (i < 40) {
				System.out.println("i<40");
			}
			else {
				System.out.println("i>=40");
				if (i <60) {
					System.out.println("i<60");
				}
				else {
					System.out.println("i>=60");
				}
			}
			
		}
			
	}
}