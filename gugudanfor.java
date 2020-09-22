package loopexample;

public class gugudanfor {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int first = 1; first <= 9; first++)
		{
			for(int second = 1; second <= 9; second++)
			{
				sum = first * second;
				System.out.println(first + " X " + second + " = "+ sum);
			}
			System.out.println("\n");
		}
		
	}
}
