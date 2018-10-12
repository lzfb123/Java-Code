public class TestArgs {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	
	
	//System.out.println("Usage: java Test \"n1\" \"op\" \"n2\"");
	
	if(args.length<3) {
		System.out.println("Usage: java Test \"n1\" \"op\" \"n2\"");
		System.exit(-1);
	}
	double d1 = Double.parseDouble(args[0]);
	double d2 = Double.parseDouble(args[2]); //parse强制转换，把arg[] String型转换为 double型
	double d = 0;
	if(args[1].equals("+")) d = d1 + d2;
	else if(args[1].equals("-")) d = d1 - d2;
	else if(args[1].equals("x")) d = d1 * d2; //这里不能用*, *有特殊的含义
	else if(args[1].equals("/")) d = d1 / d2;
	else {
		System.out.println("Error operation!");
		System.exit(-1);
	}
	System.out.println(d);
	}
}