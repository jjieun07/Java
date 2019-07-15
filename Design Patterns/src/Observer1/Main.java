package Observer1;

public class Main {

	public static void main(String[] args) {
		Book page = new Book();
		Customer L = new Lion();  // 고객1
		Customer M = new Muji();  // 고객2

		page.bookService(L);  // 고객1이 책 서비스에 등록
		page.bookService(M);  // 고객2이 책 서비스에 등록

		page.newBook();  // 새로운 책을 추가함

		page.bookCancel(M);  // 고객2가 책 서비스를 취소

		page.newBook();  // 새로운 책을 추가함	
	}

}
