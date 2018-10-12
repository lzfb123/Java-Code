
public class EXM6 {
	public static void main(String[] args) {
		EXM6 exm = new EXM6();
		exm.print(exm.change(args));
		exm.print(exm.order(exm.change(args)));	
	}
	
	void print(int[] s) {
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println("");
	}
	
	int[] change(String[] s) {
		int[] c;
		c = new int[s.length];
		for(int i=0; i<s.length; i++) {
			c[i] = Integer.parseInt(s[i]);
		}
		return c;
	}
	
	int[] order(int[] s) {
		int o;
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i] >= s[j]) {
				o = s[i];
				s[i] = s[j];
				s[j] = o;
				}
			}
		}
		return s;
	} 
}