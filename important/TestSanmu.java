public class TestSanmu {
	public static void main(String[] arg) {
		int x = -100;
		int flag = x==-1 ? 1 : (x == 0 ? 0 : -1); //x��ֵû���-1//
		System.out.println(x);
		System.out.println(flag);
		x = -100;
		int flag2 = x==-99 ? 1 : (x == 0 ? 0 : x++); /*���ȼ��� x== 0 ? 0 : x; ���Ϊ x = -100 ,
		                                               Ȼ����� x== -99 ? 1 : -100; ���Ϊ x = -100,
													   ��� x++�� ���Ϊ x = -99; */
		System.out.println(x);
		System.out.println(flag2);
		x = -100;
		int flag3 = x==-99 ? 1 : (x == 0 ? 0 : ++x); /*���ȼ��� ++x�� ���Ϊ x = -99;
													   Ȼ����� x== 0 ? 0 : x; ���Ϊ x = -99 ,
		                                               ������ x== -99 ? 1 : -99; ���Ϊ x = -99, flag3 = 1;*/								   											    
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