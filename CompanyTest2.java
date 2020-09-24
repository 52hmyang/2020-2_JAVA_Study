package singleten;

import java.util.Calendar;

public class CompanyTest2 {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		//Company c3 = new Company();  error
		System.out.println(c1 == c2);		//두개 모두 같은 것을 지칭하고 있음.
		//true
		
		// 이 코드만 주었을 때, singleten코드를 짜라는 문제이다.
	}

}
