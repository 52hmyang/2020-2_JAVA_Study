package thisex;


class Person{
	String name;
	int age;
	
	public Person()	{
		this("�̸�����", 1);	// this�տ� � ���嵵 �ͼ��� �ȵ�. Ex)name = "test";
	}
	
	public Person(String name, int age) {	//�ٸ������ڸ� ȣ����
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();		// �ڽ��� �޸𸮸� ����Ŵ
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); 	//�ڽ��� �ּҸ� ��ȯ��
	}

}
