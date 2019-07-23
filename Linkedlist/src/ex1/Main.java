package ex1;
import java.util.*;

class A {}

public class Main {
	public static void main(String[] args) {
		LinkedList<A> a1 = new LinkedList<A>();
		LinkedList<A> a2 = new LinkedList<A>();
		LinkedList<A> a3 = new LinkedList<A>();
		
		a1.add(new A());
		a1.add(new A());
		
		//<> -> container
		LinkedList<LinkedList<A>> a4 = new LinkedList<LinkedList<A>>();
		
		a4.add(a1);
		a4.add(a2);
		a4.add(a3);
		
		for (LinkedList<A> list : a4) {
			for(A item : list) {
				System.out.println("오키오키");
			}
		}
	}
}
