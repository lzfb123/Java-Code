public class EXM2 {
	public static void main(String[] arg) {
		int j = 200;
		for(int i=101;i<j;i++) {
			boolean f = true;
			for(int k=2;k<i;k++) {
				if(i%k == 0) {
					f =false;
					break;
				}			
			}
			if(!f) continue;
			System.out.println(i);				
		}
	}
}