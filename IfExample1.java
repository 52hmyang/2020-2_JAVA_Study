package ifexample;

public class IfExample1 {

	public static void main(String[] args) {
		
		int age = 10;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		//	System.out.println("test");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}// 하나의 수행문인 경우 중괄호를 넣지 않아도 오류가 나지않지만
		// 가독성을 위해서 사용하는것을 권장한다.
	}

}
