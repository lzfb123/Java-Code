public class TestSanmu {
	public static void main(String[] arg) {
		int x = -100;
		int flag = x==-1 ? 1 : (x == 0 ? 0 : -1); //x的值没变成-1//
		System.out.println(x);
		System.out.println(flag);
		x = -100;
		int flag2 = x==-99 ? 1 : (x == 0 ? 0 : x++); /*首先计算 x== 0 ? 0 : x; 结果为 x = -100 ,
		                                               然后计算 x== -99 ? 1 : -100; 结果为 x = -100,
													   最后 x++； 结果为 x = -99; */
		System.out.println(x);
		System.out.println(flag2);
		x = -100;
		int flag3 = x==-99 ? 1 : (x == 0 ? 0 : ++x); /*首先计算 ++x； 结果为 x = -99;
													   然后计算 x== 0 ? 0 : x; 结果为 x = -99 ,
		                                               最后计算 x== -99 ? 1 : -99; 结果为 x = -99, flag3 = 1;*/								   											    
		System.out.println(x);
		System.out.println(flag3);
		x = -100;
		int flag4 = x==-1 ? 1 : (x == 0 ? 0 : x+1); 
		System.out.println(flag4);
		x = -100;
		int flag5 = x==0 ? 1 : (++x == -99 ? 0 : x);
		System.out.println(x);
		System.out.println(flag5);
		x = -100;
		int flag6 = x==0 ? 1 : (x++ == -99 ? 0 : x);
		System.out.println(x);
		System.out.println(flag6);
	}
}