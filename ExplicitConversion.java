package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);	// 데이터유실
		
		double dNum = 3.14;
		iNum = (int)dNum;		// 소수점 이후 유실 상관없다 
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);	// 유실됨
		System.out.println(num2);
		
	}

}
