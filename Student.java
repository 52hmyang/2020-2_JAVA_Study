package staticex;

public class Student {
	
	private int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public int getSerialNum() {	//���������� ������ �����Ҽ��� ����.
		int i = 10;		//��������
		i++;
		System.out.println(i);
		
		//studentName = "ȫ�浿;"		�ν��Ͻ� ����(�������):������ ��Ȯ���� �ν��Ͻ� ������ ����Ҽ� ����
		return serialNum;		//static ����, Ŭ���� ����(�ٸ����� ����ϰ� ����)
	}

	
	
}
