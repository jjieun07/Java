package sort1;

import java.util.*;

class A {
	int n1, n2;
	String s;
	
	public A(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	void output( ) {
		System.out.println(n1 + " " + n2);
	}
}

public class Main {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		
		for(int i = 0; i < 5; i++) {
			int random1 = (int)(Math.random() * 100);
			int random2 = (int)(Math.random() * 100);
			
			list.add(new A(random1, random2));
		}
		
		for(A item : list) {
			item.output();
		}
		
		System.out.println("----------sort-----------");
		
		Collections.sort(list, new Comparator<A>() {
			public int compare(A o1, A o2) {
				int r1 = o1.n1 * o1.n2;
				int r2 = o2.n1 * o2.n2;
						
				if(r1 > r2) {
					return 1;
				} else
					return -1;
			}
		});
		
		for(A item : list) {
			item.output();
			System.out.println("n1 * n2 = " + item.n1 * item.n2);
		}
	}
}
