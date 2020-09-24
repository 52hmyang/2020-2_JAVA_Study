package staticex;

public class Student {
	
	private int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public int getSerialNum() {	//가져갈수는 있지만 변경할수는 없다.
		int i = 10;		//지역변수
		i++;
		System.out.println(i);
		
		//studentName = "홍길동;"		인스턴스 변수(멤버변수):생성이 불확실한 인스턴스 변수를 사용할수 없음
		return serialNum;		//static 변수, 클래스 변수(다른언어에도 비슷하게 사용됨)
	}

	
	
}
