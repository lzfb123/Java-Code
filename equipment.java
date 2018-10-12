import java.io.*;
import java.util.*;
public class equipment {
	public static void main(String[] args){
		levelup _level = new levelup();
		rate _rate = new rate();
		while(_level.level<15){
			_rate.update();
			_level.lvup();
		}
		System.out.println("强化次数:" + _level.number);
	}


}
	class levelup {
		static int level = 0;
		static int number = 0;
		public void lvup() {
			int success = (int)(Math.random()*100);
			if (success >= rate.rate){
				level++;
				System.out.println("强化成功!当前装备等级为:" + level);
			}
			else {
				System.out.println("强化失败");
			}
			number++;
		}
		
	}
	
	class rate {
		static int rate = 0;
		
		public void update(){
			switch(levelup.level){
				case 0:{ rate = 0; break;}
				case 1:{ rate = 1; break;}
				case 2:{ rate = 3; break;}
				case 3:{ rate = 5; break;}
				case 4:{ rate = 7; break;}
				case 5:{ rate = 9; break;}
				case 6:{ rate = 20; break;}
				case 7:{ rate = 30; break;}
				case 8:{ rate = 50; break;}
				case 9:{ rate = 60; break;}
				case 10:{ rate = 70; break;}
				case 11:{ rate = 80; break;}
				case 12:{ rate = 90; break;}
				case 13:{ rate = 95; break;}
				case 14:{ rate = 99; break;}
			}			
			
		}
	}



		
		
		
