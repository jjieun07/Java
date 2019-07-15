package Observer1;

public class Main {

	public static void main(String[] args) {
		Book page = new Book();
		Customer L = new Lion();  // ��1
		Customer M = new Muji();  // ��2

		page.bookService(L);  // ��1�� å ���񽺿� ���
		page.bookService(M);  // ��2�� å ���񽺿� ���

		page.newBook();  // ���ο� å�� �߰���

		page.bookCancel(M);  // ��2�� å ���񽺸� ���

		page.newBook();  // ���ο� å�� �߰���	
	}

}
