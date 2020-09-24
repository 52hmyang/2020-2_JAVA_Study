package singleten;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);		//두개 모두 같은 것을 지칭하고 있음.
		System.out.println(c2);		//프레임워크 등에서 사용되고있음.
		
		Calendar cal = Calendar.getInstance();
		
		
		
		
	}

}
