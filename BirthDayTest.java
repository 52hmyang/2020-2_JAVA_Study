package hiding;

class BirthDay {
	
	public int day;		//모두 가져다쓸수있음
	private int month;	//이페이지 안에서만 가져다쓸수 있음
	int year;			//같은 package 안에서만 쓸수있음
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day <1 || day >28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
		
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
	
}
}
