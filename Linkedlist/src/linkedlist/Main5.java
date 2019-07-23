package linkedlist;

import java.util.LinkedList;

interface A {
	void func1();
}

class B implements A {
	public void func1() {
		System.out.println("B.func1");
	}
	
	void func2() {
		System.out.println("B.func2");
	}
}

class C implements A {
	public void func1() {
		System.out.println("C.func1");
	}
	
	void func3() {
		System.out.println("C.func3");
	}
}

class D {
	void func1(LinkedList<A> list) {
		for(A item:list) {
			item.func1();
		}
		((B)list.get(0)).func2();
		
		for (A item : list) {
			// 판별하고자 하는 객체 instanceof type
			if (item instanceof B) {
				B b = (B) item;
				b.func2();
			}

			if (item instanceof C) {
				C c = (C) item;
				c.func3();
			}
		}
		System.out.println("D.func1");
	}
}

public class Main5 {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList();
		
		list.add(new B());
		list.add(new C());
		list.add(new B());
		list.add(new C());
		
		D d = new D();
		d.func1(list);
		
		A a1 = new B();
		a1.func1();
//		a1.func2();	-> 사용불가
		((B)a1).func2();	// 강제로 casting을 하여 문법 사용
		
		
	}
}
