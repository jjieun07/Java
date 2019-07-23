package sort;

import java.util.*;

class A {
//	int n;
	float n;
	String s;
	
//	public A(int n, String s) {
//		this.n = n;
//		this.s = s;
//	}
	
	public A(float n, String s) {
		this.n = n;
		this.s = s;
	}
	
	void output( ) {
		System.out.println(n + " " + s);
	}
}
public class Main {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();

//		for(int i = 0; i < 5; i++) {
//			int random = (int)(Math.random() * 100);
//			
//			list.add(new A(random, "ȣ����" + i));
//		}		
		
		// float�� ���� �� �� ex1(ex2)�� �� �� �ۿ� ����!
		list.add(new A(0.11f, "ȣ����0"));
		list.add(new A(0.21f, "ȣ����1"));
		list.add(new A(0.52f, "ȣ����2"));
		list.add(new A(0.66f, "ȣ����3"));
		list.add(new A(0.48f, "ȣ����4"));
		
		for(A item:list) {
			item.output();
		}
		
		System.out.println("----------sort-----------");
		// Collections -> Ŭ���� ���ο� static �Լ��� �ִ� -> ��ü�� ���� �ʿ䰡 ����.
		// Collections.sort(������ ��ü, new Comparator('�͸��Լ�')), 
		// Comparator -> interface -> �Լ� ���� �ʿ� (�͸��Լ�)
		
		// ex1
//		Collections.sort(list, new Comparator<A>() {
//			@Override
//			// quick sort
//			public int compare(A o1, A o2) {
//				// �ε�ȣ ��ȣ�� �ٲٸ� ��������
//				// �������� �߻�
//				// 1�� +1�� �ٸ���...?
//				if(o1.n > o2.n) {
//					return 1;	// ����� ���縦 1�� ����
//				} else
//					return -1;
//			}
//		});
		
		// ex2 _ ���׿���
//		Collections.sort(list, new Comparator<A>() {
//			public int compare(A o1, A o2) {
//				return o1.n>o2.n ? 1:-1;	
//			}
//		});
		
		// ex3
//		Collections.sort(list, new Comparator<A>() {
//			public int compare(A o1, A o2) {
//				// return ������ ����� ��ȯ�ϴ��� ������ ��ȯ�ϴ����� ����
//				return  o1.n - o2.n;	
//			}
//		});
		
		
		// ex4 _ ����
//		Collections.sort(list, (o1, o2) -> {
//			return o1.n - o2.n;
//		});
		
		
		// ex5 _ ���� -> n�� �ڷ����� int �϶� ����
//		Collections.sort(list, (o1, o2) ->  o1.n - o2.n);
		
		
		for(A item:list) {
			item.output();
		}
	}
}
