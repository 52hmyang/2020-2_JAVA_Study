package singleten;

public class Company {

	private static Company instance = new Company();
	//	 	단 한개
	private Company(){		//외부에서 컨스터럭터를 호출하지 못하게 하겠다
		
	}
	
	public static Company getInstance() {	//가져다쓸수있게만듬.
		   //객체를 생성하지 않고 호출하는 방법
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
