public class TestConvert2{
	public static void main(String[] arg){
			int i=1,j;
			float f1=0.1f;float f2=123; //0.1Ϊdouble���ͣ���ֵ��float������Ҫ��f,����ǰ���ǿ��ת������//
			long l1=12345678,l2=8888888888L;
			double d1=2e20, d2=124;
			byte b1=1,b2=2,b3=127;  //byteֱ�Ӹ�ֵ���ܳ���-128~127//
			j=0; j=j+10; //����Ҫ����������ֵ��Ȼ�����ʹ��//
			i=i/10; //i��int���ͣ�10Ҳ��int���ͣ���������int���ͣ����Կ���//
			i=(int)(i*0.1); /*i��int���ͣ�0.1��double���ͣ���������double���ͣ�������Ȼ���������һ��������
			              Ҫ��ǿ��ת������*/
						  //ǿ��ת�����ź���ı��ʽ�ǵü�����//
			char c1='a',c2=125;
			byte b=(byte)(b1-b2); /*byte,short,char����ʱ���Ȼ�ת��Ϊint���ͣ���˼�����Ϊint���ͣ�����Ҫ��
			                    ǿ��ת������*/
			char c=(char)(c1+c2-1); //ͬ��//
			float f3=f1+f2;
			float f4=(float)(f1+f2*0.1);
			double d=d1*i+j;
			float f=(float)(d1*5+d2);
	}
}
			