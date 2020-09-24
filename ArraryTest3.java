// 문자형 배열(기본 배열)
package array;

public class ArraryTest3 {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';	//65
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
		//객체 배열도 배워야함
	}

}
