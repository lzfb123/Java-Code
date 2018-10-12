public class TestConvert{
	public static void main(String[] arg){
		int i1=123; int i2=456;
		double d1=(i1+i2)*1.2;//系统将转换为double型运算//
		float f1=(float)((i1+i2)*1.2);//需要加强制转换符//
		byte b1=67; byte b2=89;
		byte b3=(byte)(b1+b2);//系统将转换为int型运算，需要强制转换符//
		System.out.println(b3);/*int 转换为 byte即使溢出也可以，将int的四个字节
		                         砍为byte的一个字节就行了*/
		double d2=1e200;
		float f2=(float)d2;/*会产生溢出,无法砍掉后面的字节，因为有小数点的存在
		                      数据会不完整*/
		System.out.println(d2);
		System.out.println(f2);
		float f3=1.23f;//必须加f//
		long l1=123;
		long l2=30000000000L;//必须加l//
		float f=l1+l2+f3;//系统将转换为float型运算//
		long l=(long)f;//强制转换会舍去小数部分（不是四舍五入）//
	}
}
		