public class TestFBNQ {
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // 这段代码放在程序执行前
		int i = 50;
		
		//System.out.println(FBNQ(i));
		
		
		System.out.println(FBNQB(i));
		
		
		
		System.out.println(FBNQC(i));
		long end = System.currentTimeMillis() - begin; // 这段代码放在程序执行后
		System.out.println("耗时：" + end + "毫秒");
		System.out.println("递归次数：" + DGCS(i));
			
	}
	//i = 50 时，FBNQ()耗时 43884 ms; FBNQB()耗时 0 ms; FBNQC()耗时 1 ms; //
	//i = 100 时，FBNQ()耗时 ??? ms; FBNQB()耗时 0 ms; FBNQC()耗时 1 ms; //
	
	
	
	public static long FBNQ(int j) {
		if(j == 1 || j == 2) return 1;
		else return FBNQ(j-1) + FBNQ(j-2);			
	}
	 
	
	public static long FBNQB(int i) {                      
		long j = 0L , k = 1L , res = 0L;
		int n = 1, m = 0; 		
		boolean f = true;                                     
		switch(i % 3) {                                     
		case 1:  {
			m = i + 2; 
			f = false; 
			break;
		}
		case 2: {
			m = i + 1; 
			f = true; 
			break;
		}
		default: m = i;
		}
		m = m / 3;
		while(n<=m) {
			res = j + k;
			k = j + res;
			j = k + res;
			n++;
		}
		if (i % 3 == 0) return j;
		else return (!f) ? res:k;
	}
	
	public static long FBNQC(int i) {
		long f1 = 1L, f2 = 1L, f = 2L;
		if (i == 1 || i == 2) return f1;
		for(int n =1;n<i-2;n++) {
			f1 = f2;
			f2 = f;
			f = f1 + f2;
		}
		return f;
	}
	
	public static long DGCS(int i) {
		long f1 = 1L, f2 = 1L, f = 2L;
		if (i == 1 || i == 2) return f1;
		for(int n =1;n<i-2;n++) {
			f1 = f2;
			f2 = f;
			f = f1 + f2 + 1;
		}
		return f;
	}
}
	
	
