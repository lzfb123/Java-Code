public class TestVar{
	static int j;
	public static void main(String[] args){  //不能和视频一样简写为m(),无法运行//
		int i = 0;
		char c = '\u9236';
		System.out.println(c);
		System.out.println(i);
		System.out.println(j);
		boolean b =false;
		if (b){
			System.out.println("b is true");
		}
		long longNum1 = 888888888888l; //jdk7.0中不能和视频中一样输13位长度，显示过大的整数 
	}                                  //无法输入过长的原因是后面没有加L，和版本无关
}
/*
2017/6/28

*/