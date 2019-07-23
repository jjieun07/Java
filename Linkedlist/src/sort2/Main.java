package sort2;

import java.util.*;

class AA {
	int n;
	String s;

	public AA(int n, String s) {
		super();
		this.n = n;
		this.s = s;
	}
}

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<AA> listA = new LinkedList<AA>();
		System.out.println("--------list<String>--------");
		list.add("ajk");
		list.add("Df");
		list.add("aeff");
		list.add("hj");
		list.add("gyj");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("---------sort----------");

		Collections.sort(list);

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("--------listA--------");
		listA.add(new AA(3, "dd"));
		listA.add(new AA(123, "dd"));
		listA.add(new AA(6, "dfds"));
		listA.add(new AA(52, "fgbd"));
		listA.add(new AA(88, "hjh"));

		for (AA item : listA) {
			System.out.println(item.n + " " + item.s);
		}
		System.out.println("---------sort----------");

		Collections.sort(listA, new Comparator<AA>() {
		@Override
			public int compare(AA o1, AA o2) {
				if(o1.n > o2.n)
					return +1;
				else return -1;
			}});

		for (AA item : listA) {
			System.out.println(item.n + " " + item.s);
		}
	}
}
