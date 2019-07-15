package Observer1;

import java.util.ArrayList;
import java.util.List;

public class Book implements Observable {

	List<Customer> customerList = new ArrayList<>();

	public void newBook() {
		System.out.println("���ο� ������ �߰� �Ǿ����ϴ�.");
		bookUpdate();
	}

	@Override
	public void bookService(Customer c) {
		customerList.add(c);
	}

	@Override
	public void bookCancel(Customer c) {
		customerList.remove(c);
	}

	@Override
	public void bookUpdate() {
		// observerList.forEach( Observer::Updata );
		for(Customer customer : customerList) {
			customer.Updata();
		}
		
		System.out.println(customerList.size() + "���� å �ҽ��� �����߽��ϴ�.");
	}
}