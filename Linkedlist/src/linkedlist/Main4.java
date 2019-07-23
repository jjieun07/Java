package linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


class Apple implements Comparable<Apple>{
	int n;
	String s;
	
	public Apple(int n, String s) {
		super();
		this.n = n;
		this.s = s;
	}
	
	void output() {
		System.out.println("n = " + n);
		System.out.println("s = " + s);
	}
	
	@Override
	public int compareTo(Apple o) {
		if(this.n > o.n)
			return 1;
		else if(this.n < o.n)
			return -1;
		else 
			return 0;
	}
}

public class Main4 {
	public static void main(String[] args) {
		LinkedList<Apple> list = new LinkedList<Apple>();
		System.out.println(list.size());
		
		// Create
		list.add(new Apple(5, "호랑이"));
		
		Apple a1 = new Apple(20, "코끼리");
		
		list.add(a1);
		
		// Reading
		for(Apple item : list) {
			item.output();
		}
		
		System.out.println("---------------------");
		for(int i = 0; i < 5; i++) {
			list.add(new Apple(i * 10 + 20, "독수리" + i));
		}
		
		for(Apple item : list) {
			item.output();
		}
		
		System.out.println("---------------------");
		
		list.remove(3);
		for(Apple item : list) {
			item.output();
		}
		System.out.println("---------------------");
		
		//update
		list.set(2, new Apple(99, "이거 맞나여..?"));
		for(Apple item : list) {
			item.output();
		}
		
		System.out.println("---------------------");
		// Delete
		list.remove(3);
		for(Apple item : list) {
			item.output();
		}
		
		System.out.println("---------------------");
		System.out.println("========random========");
		for(int i = 0; i < 10; i++) {
			list.add(new Apple((int)(Math.random()*100), "독수리" + i));
		}
		for(Apple item : list) {
			item.output();
		}
		System.out.println("---------------------");
		
		System.out.println("n = 짝수인 경우 삭제?");
		
		Iterator it =  list.iterator();
		
		while(it.hasNext()) {
			Apple a = (Apple) it.next();
			if(a.n % 2 == 0)
				it.remove();
		}
		for(Apple item : list) {
			item.output();
		}
		System.out.println("---------------------");
		
		System.out.println("sort");
		
		Collections.sort(list);
		
		for(Apple item : list) {
			item.output();
		}
		System.out.println("---------------------");
		
	
	}
}