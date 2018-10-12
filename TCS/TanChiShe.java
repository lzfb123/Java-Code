
import java.util.Scanner;
public class TanChiShe {
	public static void main(String[] args) {
		Wall wall = new Wall();
		wall.creatWall();
		Snake snake = new Snake();
		Snake.creatSnake();
		Food food = new Food();
		food.creatFood();
		while(true) {
			snake.display();
			if(snake.eat()) food.creatFood();
			food.display();
			snake.input();
			if(!snake.crack()) {
				System.out.println("Game Over!");
				break;
			}
			snake.move();
			if(snake.eat()) snake.add();				
		}
	}
}

class Wall {
	static char[][] a = new char[40][40]; 
	void creatWall() {
		int i = 0;
		int j = 0;
		while(i < a.length) {
			while (j < a.length) {
				if(i == 0 || i == 39) a[i][j] = '*';
				else { 
					if (j == 0 || j == 39) a[i][j] = '*';
					else a[i][j] = ' ';
				}
				j++; 
			}
			j = 0;
			i++;
		}
	}
	
	void printWall() {
		for (int i=0; i<=39; i++) {
			for (int j=0; j<=39; j++) {
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
	
	static char diswall(int i, int j) {
		return a[i][j];
	}
}

class Snake {
	static char[] a = new char[100];
	int _x = 20; 
	int _y = 20;
	
	static int[] x = new int[100];
	static int[] y = new int[100];
	
	
	static int len = 1;
	
	static void creatSnake() {
		for (int i=0; i<len; i++) {
			a[i] = '*';
		}
		x[0] = 20;
		y[0] = 20;
	
	}
	
	void input() {
		Scanner in=new Scanner(System.in);
		System.out.println("");
		System.out.println("please input 1w/2s/3a/4d");
		Time.distime();
		int a;
		a =  in.nextInt();
		switch (a) {
			case 1: { _y++; break; }
			case 2: { _y--; break; }
			case 3: { _x--; break; }
			case 4: { _x++; break; }
			default: { System.out.println("Input Error");  this.input();}
		}
	}
	
	void move() {
		for (int i=len; i-2>=0; i--) {
			x[i - 1] = x[i - 2];
			y[i - 1] = y[i - 2];
		}
		x[0] = _x;
		y[0] = _y;
	}
	
	void add() {
		len ++;
		a[len - 1] = '*';
		if (len == 2) {
			x[1] = x[0] - 1;
			y[1] = y[0];
		}
		else {
			if (x[len-2] == x[len-3]) {
				if (y[len-3] > y[len-2]) {
					y[len-1] = y[len-2]-1;
					x[len-1] = x[len-2];
				}
				else {
					y[len-1] = y[len-2]+1;
					x[len-1] = x[len-2];
				}
			}
			else {
				if (x[len-3] > x[len-2]) {
					x[len-1] = x[len-2]-1;
					y[len-1] = y[len-2];
				}
				else {
					x[len-1] = x[len-2]+1;
					y[len-1] = y[len-2];
				}
			}
		}	
	}
	
	void display() {
		System.out.println("length = " + len);
		for (int i=0; i<len; i++) System.out.print("("+ x[i] + "," + y[i] + ");");
		System.out.println("");
	}
	
	boolean crack() {
		boolean b = true;
		if(Wall.diswall(_x, _y) == '*') b = false;
		else {
			for(int i=1; i<Snake.len; i++ ) { 
				if(_x == x[i] && _y == y[i]) b = false;
			}
		}
		return b;		
	}
	
	static int dissnake_X(int i) {
		return x[i];
	}
	
	static int dissnake_Y(int i) {
		return y[i];
	}
	
	boolean eat() {
		if (x[0] == Food.x && y[0] == Food.y) return true;
		else return false;
	}
}

class Food {
	static int x;
	static int y;
	void creatFood() {
		boolean b = true;
		for(int i=0; i<Snake.len; i++ ) {
			if(b) x = 1+(int)(Math.random() * 38);
			if(b) y = 1+(int)(Math.random() * 38);
			if(x == Snake.dissnake_X(i) || y == Snake.dissnake_Y(i)) {
				b = true;
				i = -1;
			}
			else b =false;
		}		
	}
	
	void display() {
		System.out.println("food:(" + x +"," + y + ")");
	}
}
	

		
		
		
