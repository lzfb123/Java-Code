public class EXM7 {
	public static void main(String[] args) {
		Team[] team = new Team[Team.len];
		for(int i=0; i<team.length; i++) team[i] = new Team();
		Team.mark(team);
		Team.delete(3,team);
		Team.display(team);	
	}
}

class Team {
	static int len = 500;
	static int out = 0;
	private boolean bool = true;
	
	public boolean getBool() {
		return bool;
	}
	
	public void setBool() {
		bool = false;
	}

	public static void delete(int del, Team[] t) {
		int i = 0;
		int j = 1;
		while(out<len-1) {
			if(i > t.length - 1) i = 0;
			if(!t[i].getBool()) j--; 
			if(j == del) {
				t[i].setBool();
				j = 0;
				out ++;
			}
			i++;
			j++;			
		}	
	}
	
	public static void display(Team[] t) {
		for(int i=0; i<t.length; i++) {
			if(t[i].getNum() != -1) System.out.println(t[i].getNum());
		}
	}
}
