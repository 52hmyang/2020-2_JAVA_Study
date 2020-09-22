package loopexample;

public class gugudanwhile2 {

	public static void main(String[] args) {
		
		int first = 1;
		int second = 1;
		int sum = 0;
		
		while(first <= 9) {
			second = 1;
			while(second <= 9) {
				sum = first * second;
				System.out.println(first+ " X " +second+ " = " +sum);
				second++;
			}
			first++;
			System.out.println("\n");
		}
		
	}

}
