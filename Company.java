package singleten;

public class Company {

	private static Company instance = new Company();
	//	 	�� �Ѱ�
	private Company(){		//�ܺο��� �����ͷ��͸� ȣ������ ���ϰ� �ϰڴ�
		
	}
	
	public static Company getInstance() {	//�����پ����ְԸ���.
		   //��ü�� �������� �ʰ� ȣ���ϴ� ���
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
