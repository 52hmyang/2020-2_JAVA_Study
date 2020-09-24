package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);	//총 행의 길이가 나옴
		System.out.println(arr[0].length);	//0번째 행의 길이가 나옴
		
		for(int i = 0; i < arr.length; i++) {	//0.0 ~ 1.0
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);	// 0,0 ~ 0,2
			}
		}
		
	// 알파벳 출력하는 문제 풀어보기
		
	}

}
