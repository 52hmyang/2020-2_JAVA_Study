package singleten;

import java.util.Calendar;

public class CompanyTest2 {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		//Company c3 = new Company();  error
		System.out.println(c1 == c2);		//�ΰ� ��� ���� ���� ��Ī�ϰ� ����.
		//true
		
		// �� �ڵ常 �־��� ��, singleten�ڵ带 ¥��� �����̴�.
	}

}
