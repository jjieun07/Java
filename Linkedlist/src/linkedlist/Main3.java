package linkedlist;

import java.util.*;

// ex20 _ ������
public class Main3 {
	static void func1(AbstractList a) {
		
	}
	
	// F4 Ű - ��� ������ �� �� ����
	public static void main(String[] args) {
		AbstractList Llist = new LinkedList();
		LinkedList Llist2 = new LinkedList();
		ArrayList AList1 = new ArrayList();
	
		func1(Llist);
		func1(Llist2);
		func1(AList1);
		
		Llist.add("1");
		Llist.add("2");
		Llist.add("3");
		
		System.out.println(Llist);
		
//		ArrayList AList = new ArrayList(Llist);
//		ArrayList AList2 = new ArrayList(Llist);

		Queue q = Llist2;
	}
}
