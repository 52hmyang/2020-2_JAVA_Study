// 실수 배열(기본배열)
package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		for(int i=0; i<size; i++)	//값이 존재하는 것만 곱해준다
		{
			System.out.println(num[i]);
			total *= num[i];
		}
		System.out.println("total = "+ total);
	}

}
