public class TestDataSort_2 {
	public static void main(String[] args) {
		Data _data = new Data();
		Data[] data = new Data[10];
		data[0] = new Data(1970,1,1);
		data[1] = new Data(1970,1,2);
		data[2] = new Data(1970,2,1);
		data[3] = new Data(1999,1,1);
		data[4] = new Data(1960,9,1);
		data[5] = new Data(2002,1,1);
		data[6] = new Data(1994,1,31);
		data[7] = new Data(1970,9,1);
		data[8] = new Data(1348,11,11);
		data[9] = new Data(1970,1,1);
		_data.print(_data.order(data));
		
	}
}

class Data {
	private int year, month, day;
	
	Data(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	Data() {}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void print(Data[] d) {
		for(int i=0; i<d.length; i++) {
			System.out.println("year/month/day:" + d[i].getYear() + "/" + d[i].getMonth() +"/" + d[i].getDay());
		}
	}
	
	public boolean compare(Data b) {
		return this.getYear() > b.getYear() ? true : 
			   this.getYear() < b.getYear() ? false :
			   this.getMonth() > b.getMonth() ? true :
			   this.getMonth() < b.getMonth() ? false :
			   this.getDay() > b.getDay() ? true : false;
	}
	
	public Data[] order(Data[] d) {
		Data temp = new Data();
		for(int i = d.length-1; i>0; i--) {
			for(int j = 0; j<= i-1; j++) {
				if(d[j].compare(d[j+1])) {
					temp = d[j];
					d[j] = d[j+1];
					d[j+1] = temp;
				}
			}
		}
		return d;
	}
}



	
