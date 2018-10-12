import java.io.*;
import java.util.*;
public class TanChiShe_plus {
	public static void main(String[] args) {
		Wall _wall = new Wall();
		Snake _snake = new Snake();
		Food _food = new Food();
		Judge w_judge = new Judge(_wall);
		Judge s_judge = new Judge(_snake);
		Judge f_judge = new Judge(_food);
		w_judge.create();
		s_judge.create();
		f_judge.create();
		while(true) {
			s_judge.display();
			f_judge.display();
			try {                                    
			_snake.input();
			} catch(InputMismatchException ex) {
				System.out.println("input error");
			// 用来捕获错误输出 //
			}
			_snake.move();
			s_judge.equals();
			w_judge.equals();
			f_judge.equals();
		}
	}
}

class Point {
	private int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point() {}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void create() {}
	public void equals() {}
	public void display(){}
	public void display(Point p) {
		System.out.print("(" + p.getX() + "," + p.getY() + ") ");
	}
}

class Wall extends Point {
	static Point[] wall = new Point[156];  
	// 场地为40*40 //
	Wall() {}
	
	public void create() {
		for(int i=0; i<156; i++) wall[i] = new Wall();  
		for(int i=0; i<=39; i++) {
			wall[i].setX(i);
			wall[i].setY(39);
			wall[i+78].setX(i);
			wall[i+78].setY(0);
		}
		for(int i=0; i<=37; i++) {
			wall[i+40].setX(39);
			wall[i+40].setY(38 - i);
			wall[i+118].setX(0);
			wall[i+118].setY(1 + i);
		}
	}
	// 墙的坐标为(0,0)-(0,39);(0,39)-(39,39);(0,0)-(39,0);(39,0)-(39,39) //
	public void equals() {
		for(int i=0; i<156; i++) {
			if(Snake.snake[0].getX() == wall[i].getX() && Snake.snake[0].getY() == wall[i].getY()) Judge.lose();
		}	
	}
}
	// 判断是否撞墙 //
class Snake extends Point {
	static int len = 1;          
	// 蛇的初始长度为1 //
	static int ipt;
	// 记录输入的方向 //
	static Point[] snake = new Snake[100];
	// 蛇的最大长度为101 //
	private Point s0 = new Point(20,20);
	// 记录蛇头的下一个坐标 //
	Snake() {}
	
	public void create() {
		for(int i=0; i<100; i++) snake[i] = new Snake();
		for (int i=0; i<len; i++) {
			snake[i].setX(20-i);
			snake[i].setY(20);
		}
	}
	// 蛇的初始坐标为(20,20),若初始长度大于1，则蛇身坐标(19,20),(18,20)...向x负半轴延伸 //
	void input() throws InputMismatchException {
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("please input 1:w/2:s/3:a/4:d");
		ipt = in.nextInt();
		switch(ipt) {
			case 1: { s0.setY(s0.getY() + 1); break; }
			case 2: { s0.setY(s0.getY() - 1); break; }
			case 3: { s0.setX(s0.getX() - 1); break; }
			case 4: { s0.setX(s0.getX() + 1); break; }
		}
	}
	// 记录输入的方向并计算蛇头的下一个坐标 //
	void move() {
		for (int i=len; i-2>=0; i--) {
			snake[i - 1].setX(snake[i - 2].getX());
			snake[i - 1].setY(snake[i - 2].getY());
		}
		snake[0].setX(s0.getX());
		snake[0].setY(s0.getY());
	}
	// 蛇移动后每个点的坐标变化 //
	static void add() {
		len ++;
		if (len == 2) {
			switch(ipt) {
				case 1: { snake[1].setY(snake[0].getY() - 1); snake[1].setX(snake[0].getX()); break; }
				case 2: { snake[1].setY(snake[0].getY() + 1); snake[1].setX(snake[0].getX()); break; }
				case 3: { snake[1].setY(snake[0].getY()); snake[1].setX(snake[0].getX() + 1); break; }
				case 4: { snake[1].setY(snake[0].getY()); snake[1].setX(snake[0].getX() - 1); break; }		
			}
		}
		else {
			snake[len-1].setX(snake[len-2].getX() + (snake[len-2].getX() - snake[len-3].getX()));
			snake[len-1].setY(snake[len-2].getY() + (snake[len-2].getY() - snake[len-3].getY()));		
		}	
	}
	// 蛇吃食物长度变化以及新增的蛇身的坐标 //
	public void equals() {
		for(int i=1; i<len; i++) {
			if(Snake.snake[0].getX() == snake[i].getX() && Snake.snake[0].getY() == snake[i].getY()) Judge.lose(); 
		}
	}
	// 判断是否撞到自身 //
	public void display() {
		for(int i=0; i<len; i++) {
			this.display(snake[i]);
		}	
	}	
	// 输出蛇每个点的坐标 //
}
	
class Food extends Point {
	static Point food = new Point(); 
	// 记录食物的坐标 //
	Food() {}
	
	public void create() {
		boolean b = true;
		while(b) {
			food.setX(1+(int)(Math.random() * 38));
			food.setY(1+(int)(Math.random() * 38));
			for(int i=0; i<Snake.len; i++ ) {	
				if(food.getX() == Snake.snake[i].getX() && food.getY() == Snake.snake[i].getY()) b = true;
				else b =false;
			}		
		}
	}
	// 随机数创建食物坐标，不与蛇及墙的坐标重合 //
	public void equals() {
		if(Snake.snake[0].getX() == food.getX() && Snake.snake[0].getY() == food.getY()) {
			Snake.add();
			this.create();
		}
	}
	//判断蛇是否吃到食物 //
	public void display() {
		System.out.print("food:");
		this.display(food);
	}
	// 输出食物的坐标 //
}

class Judge {
	private Point point;
	
	Judge(Point point) {
		this.point = point;
	}
	
	public void create() { point.create(); }
	
	public void equals() { point.equals(); }
	
	public void display() { point.display(); }
	
	public static void lose() {
		System.out.println("Game Over!");
		System.exit(-1);
	}
	// 失败，用于结束程序 //
}



		
		
		
