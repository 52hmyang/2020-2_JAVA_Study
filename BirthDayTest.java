package hiding;

class BirthDay {
	
	public int day;		//��� �����پ�������
	private int month;	//�������� �ȿ����� �����پ��� ����
	int year;			//���� package �ȿ����� ��������
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day <1 || day >28) {
				System.out.println("��¥ �����Դϴ�.");
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
