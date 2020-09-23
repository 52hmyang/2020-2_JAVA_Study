package thisex;


class Person{
	String name;
	int age;
	
	public Person()	{
		this("이름없음", 1);	// this앞에 어떤 문장도 와서는 안됨. Ex)name = "test";
	}
	
	public Person(String name, int age) {	//다른생성자를 호출함
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();		// 자신의 메모리를 가리킴
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); 	//자신의 주소를 반환함
	}

}
