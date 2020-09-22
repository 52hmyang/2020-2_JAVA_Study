package loopexample;

public class gugudanwhile {

	public static void main(String[] args) {
		
		int first = 1;
		int second = 1;
		int sum = 0;
		
		while(first <= 9) {
			if((first % 2) != 0) {
				first++;
				continue;
			}
				
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
