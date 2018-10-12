public class TestDataSort {
	public static void main(String[] args) {
		Data d = new Data();
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
		d.print(d.order(data));
		
	}
}

class Data {
	int year, month, day;
	Data(int i, int j, int k) {
		year = i;
		month = j;
		day = k;
	}
	Data(){};
	
	int getYear() { return year; }
	int getMonth() { return month; }
	int getDay() { return day; }
	public boolean compare(Data b) {
		if(!(this.getYear()== b.getYear())) {
			return (this.getYear()<b.getYear()? true:false);
		}
		else {
			if(!(this.getMonth()== b.getMonth())) {
				return (this.getMonth()<b.getMonth()? true:false);
			}
			else {
				if(!(this.getDay()== b.getDay())) return (this.getDay()< b.getDay()? true:false);
				else return true;
			}
		}
	}
	
	public void print(Data[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].getYear() + "/" + a[i].getMonth() + "/" + a[i].getDay() + " ");
		}
	}
	
	public Data[] order(Data[] d) {
		Data temp = new Data();
		for(int i=0; i<d.length; i++) {
			for(int j=i+1; j<d.length; j++) {
				if(!d[i].compare(d[j])) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		return d;
	}
}
			

	
