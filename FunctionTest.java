package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int num1, int n2) {
		int result = num1 + n2;
		return result;
	}
	
}
