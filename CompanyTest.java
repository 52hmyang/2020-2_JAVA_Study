package singleten;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);		//�ΰ� ��� ���� ���� ��Ī�ϰ� ����.
		System.out.println(c2);		//�����ӿ�ũ ��� ���ǰ�����.
		
		Calendar cal = Calendar.getInstance();
		
		
		
		
	}

}
