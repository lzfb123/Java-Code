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
			// �������������� //
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
	// ����Ϊ40*40 //
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
	// ǽ������Ϊ(0,0)-(0,39);(0,39)-(39,39);(0,0)-(39,0);(39,0)-(39,39) //
	public void equals() {
		for(int i=0; i<156; i++) {
			if(Snake.snake[0].getX() == wall[i].getX() && Snake.snake[0].getY() == wall[i].getY()) Judge.lose();
		}	
	}
}
	// �ж��Ƿ�ײǽ //
class Snake extends Point {
	static int len = 1;          
	// �ߵĳ�ʼ����Ϊ1 //
	static int ipt;
	// ��¼����ķ��� //
	static Point[] snake = new Snake[100];
	// �ߵ���󳤶�Ϊ101 //
	private Point s0 = new Point(20,20);
	// ��¼��ͷ����һ������ //
	Snake() {}
	
	public void create() {
		for(int i=0; i<100; i++) snake[i] = new Snake();
		for (int i=0; i<len; i++) {
			snake[i].setX(20-i);
			snake[i].setY(20);
		}
	}
	// �ߵĳ�ʼ����Ϊ(20,20),����ʼ���ȴ���1������������(19,20),(18,20)...��x���������� //
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
	// ��¼����ķ��򲢼�����ͷ����һ������ //
	void move() {
		for (int i=len; i-2>=0; i--) {
			snake[i - 1].setX(snake[i - 2].getX());
			snake[i - 1].setY(snake[i - 2].getY());
		}
		snake[0].setX(s0.getX());
		snake[0].setY(s0.getY());
	}
	// ���ƶ���ÿ���������仯 //
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
	// �߳�ʳ�ﳤ�ȱ仯�Լ���������������� //
	public void equals() {
		for(int i=1; i<len; i++) {
			if(Snake.snake[0].getX() == snake[i].getX() && Snake.snake[0].getY() == snake[i].getY()) Judge.lose(); 
		}
	}
	// �ж��Ƿ�ײ������ //
	public void display() {
		for(int i=0; i<len; i++) {
			this.display(snake[i]);
		}	
	}	
	// �����ÿ��������� //
}
	
class Food extends Point {
	static Point food = new Point(); 
	// ��¼ʳ������� //
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
	// ���������ʳ�����꣬�����߼�ǽ�������غ� //
	public void equals() {
		if(Snake.snake[0].getX() == food.getX() && Snake.snake[0].getY() == food.getY()) {
			Snake.add();
			this.create();
		}
	}
	//�ж����Ƿ�Ե�ʳ�� //
	public void display() {
		System.out.print("food:");
		this.display(food);
	}
	// ���ʳ������� //
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
	// ʧ�ܣ����ڽ������� //
}



		
		
		
