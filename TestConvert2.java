public class TestConvert2{
	public static void main(String[] arg){
			int i=1,j;
			float f1=0.1f;float f2=123; //0.1为double类型，赋值给float后面需要加f,或者前面加强制转换符号//
			long l1=12345678,l2=8888888888L;
			double d1=2e20, d2=124;
			byte b1=1,b2=2,b3=127;  //byte直接赋值不能超过-128~127//
			j=0; j=j+10; //变量要先声明，后赋值，然后才能使用//
			i=i/10; //i是int类型，10也是int类型，运算结果是int类型，所以可以//
			i=(int)(i*0.1); /*i是int类型，0.1是double类型，运算结果是double类型，所以虽然结果和上面一样，但是
			              要加强制转换符号*/
						  //强制转换符号后面的表达式记得加括号//
			char c1='a',c2=125;
			byte b=(byte)(b1-b2); /*byte,short,char计算时首先会转换为int类型，因此计算结果为int类型，所以要加
			                    强制转换符号*/
			char c=(char)(c1+c2-1); //同上//
			float f3=f1+f2;
			float f4=(float)(f1+f2*0.1);
			double d=d1*i+j;
			float f=(float)(d1*5+d2);
	}
}
			