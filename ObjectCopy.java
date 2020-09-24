package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산백1","조정래");
		bookArray1[1] = new Book("태백산백2","조정래");
		bookArray1[2] = new Book("태백산백3","조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i <bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i <bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=====");
		for(int i = 0; i <bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		// 값이 복사된것이 아니라 주소가 복사되었기 때문에(복사한 것의 값이 바뀌면 복사된 것의 값도 바뀐다)
		// 두개의 배열이 다른값을 가져야 할때는 깊은 복사를 해야함.
	}

}
