import java.io.*;

public class TestEx {
	public static void main(String[] args) {
	int[] arr = {1, 2, 3};
	System.out.println(arr[2]);
	try {
		System.out.println(2/0);
	} catch (ArithmeticException ae) {
		System.out.println("error");
		ae.printStackTrace();
	}
	
	TestEx te = new TestEx();
	te.m(0);
	
	try {
		new TestEx().m(0);
	} catch (ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println("error");
	}
	}
	*/
	FileInputStream in = null;
	
	try {
		in = new FileInputStream("myfile.txt");
		int b;
		b= in.read();
		while (b != 1) {
			System.out.print((char) b);
			b = in.read();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println(e.getMessage());
	} finally {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
			
	
	void m(int i) throws ArithmeticException {
		if(i == 0)
			throw new ArithmeticException("bei chu shu wei 0");
	}
	
	void f() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while (b != -1) {
			
		}
	}
	
	void f2() throws Exception {
		f();
	}
	
	
}
	
	



