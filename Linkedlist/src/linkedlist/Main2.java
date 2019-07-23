package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.Stack;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		// LinkedList<int> list1 = new LinkedList(); -> linkedlist�� ��ü/Ŭ������
//		LinkedList list1 = new LinkedList();
//
//		// ex1 _ item 1�� �߰�
//		list1.add("�ű���");
//		System.out.println(list1);
//		
//		// ex2 _ ������ ��ü�� ��ġ�ϴ� ù��° item ����
//		list1.add("������");
//		list1.add("������");
//		list1.add("������");
//		
//		System.out.println(list1);
//		list1.removeFirstOccurrence("������");
//		System.out.println(list1);
//		
//		// ex3 _ poll�� pop�� ����
//		list1.clear();
//		System.out.println(list1);
//		
//		System.out.println(list1.poll());
////		System.out.println(list1.pop()); _ list�� ��������� pop�� �� ��� ���� �߻�
//		
//		// ex4 _ contains ���� ���ԵǾ� �ִ°�
//		for(int i = 0; i < 10; ++i) {
//			list1.add("data" + i);
//		}
//		
//		System.out.println(list1);
//		System.out.println(list1.contains("data5"));
//		System.out.println(list1.contains("data"));
//		
//		
//		// ex5 _ containsAll 
//		LinkedList<String> client2 = new LinkedList<String>();
//		client2.add("�ű���");
//		client2.add("������");
//		client2.add("������");
//		client2.add("������");
//		System.out.println(client2);
//		
//		LinkedList<String> client3 = new LinkedList<String>();
//		
//		client3.add("������");
//		client3.add("������");
//		System.out.println(client3);
//		
//		System.out.println(client2.containsAll(client3));
//		
//		// ex6 _ Arraylist�� Linkedlist�� �ӵ� ����
//		
		// ex7 _ ��� 3����
		LinkedList<Integer> link4 = new LinkedList<Integer>();

		link4.add(0);
		link4.add(0);
		link4.add(0);
		link4.add(0);
		link4.add(0);

		LinkedList<String> link5 = new LinkedList<String>();

		link5.add("��Ʈ");
		link5.add("��Ʈ");

		// Ȯ�ο�
		System.out.println(link4);
		System.out.println(link5);

		for (int i = 0; i < link4.size(); ++i) {
			System.out.print(link4.get(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < link5.size(); ++i) {
			System.out.print(link5.get(i) + " ");
		}

		// �ӵ�
		ListIterator<Integer> it = link4.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		// ex8 _ LinkedList�� Stack, Queue �����?
//		
//		System.out.println(1 + "������  ��ũ�� ����Ʈ");
//		List<Integer> list = new LinkedList<Integer>();
//		
//		for(int i = 0; i < 50; i++) {
//			int input = (int)(Math.random() * 100 )%100;
//			list.add(input);
//			System.out.print(String.format("%d ", input));
//		}System.out.println();
//		
//		list.sort(null);
//		
//		System.out.println(2 + "����");
//		// for-each(���ͷ����Ϳ� �ӵ� ���)
//		for (Integer item :list) {
//			System.out.print(item + " ");
//		}System.out.println();
//		
//		System.out.println("----------------------");
//		
//		System.out.println(3 + "Stack");
//		LinkedList<Integer> list5 = new LinkedList<Integer>();
//		list5.addAll(list);
//		
//		Stack<Integer> stack = new Stack<Integer>();
//		
//		while(list5.size() > 0) {
//			int first = list5.removeFirst();
//			stack.push(first);
//			System.out.print(first + " ");
//		}System.out.println();
//		
//		System.out.println("4. " + "stack pop");
//		
//		while (stack.size() > 0) {
//			System.out.print(stack.pop() + " ");
//		}
//		 
//		System.out.println("5. Queue");
//		
//		LinkedList<Integer> list3 = new LinkedList<Integer>();
//		list3.addAll(list);
//		
//		Queue<Integer> queue = new LinkedList<Integer>(list);
//		
////		while(list3.size() > 0) {
////			int last = list3.removeLast();
////			queue.offer(last);
////			System.out.println(last + " ");
////		}System.out.println();
//		
//		System.out.println("6. Queue poll");
//		
//		while(queue.size() > 0) {
//			System.out.print(queue.poll() + " ");
//		}System.out.println();

		// ex9 _ pollLast
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		Iterator it1 = list.iterator();
		while (it.hasNext()) {
//			String str = (String)it.next();
			String str = new String();
			System.out.println(str);
		}
		list.pollLast();

		// ex10 _ clear
		System.out.println("clear()");
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());

		// ex11
		LinkedList<Object> myList = new LinkedList<Object>();
		myList.add("ȫ�浿");
		myList.add(19940820);
		myList.add(2, "2��");
		myList.add('A');

		// ex12
		// ex13 _ get / set
		// ex14 _ remove

		// ex15 _ sort(�߿��ؿ�)

		LinkedList<Integer> sort = new LinkedList<Integer>();

		sort.add(3);
		sort.add(7);
		sort.add(52);
		sort.add(4);

		System.out.println(sort);
		Collections.sort(sort);
		System.out.println(sort);

		// ex16 _ ListIterator(�����)
		// .next(), .previous()
		LinkedList<String> list9 = new LinkedList<String>();
		list9.add("Hello");
		list9.add("190722");
		list9.add("min");
		list9.add("hyun");
		list9.add("���� ������ʹ�");
		list9.add("Hello");

		ListIterator<String> list_it = list9.listIterator();
		System.out.println("Before : ");
		System.out.println(list9);

		// hasNext() -> ������ ����/���� �� ���� �߻� ���� (���ϴ� �����͸� ����Ű�� ���� ���� �� ����)
		while (list_it.hasNext()) {
			System.out.print(list_it.next() + " ");
		}
		System.out.println();

		while (list_it.hasPrevious()) {
			System.out.print(list_it.previous() + " ");
		}
		System.out.println();

		Iterator x = list.descendingIterator();
		while (x.hasNext()) {
			System.out.println(x.next() + " ");
		}
		System.out.println();

		// ex17 _ indexOf
		System.out.println(list9);
		System.out.println(list9.indexOf("Hello"));
		System.out.println(list9.lastIndexOf("Hello"));
		System.out.println(list9.indexOf("Bye"));

		// ex18 _ toArray()
		String[] arr = list9.toArray(new String[list9.size()]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// ex19 _ Spliterator
		LinkedList<Shape> s_list = new LinkedList<>();
		
		for(int i = 0; i < 10000; i++) {
	//		s_list.add(new Shape("Circle" + i, i));
		}
		
		Spliterator<Shape> split = s_list.spliterator();
		ArrayList<Spliterator<Shape>> array = new ArrayList<>();
		array.add(split);
		
		int arrayCount = 0;
		
		while(true) {
			arrayCount++;
			array.add(arrayCount, array.get(0).trySplit());
			
			if(array.get(0).estimateSize() == 0)
				break;
		}
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).estimateSize());
		}
		
		int totalSize = array.size();
		int halfSize = totalSize/2;
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < halfSize; i++) {
//					while(array.get(i).tryAdvance(value) -> printDetaile(value));
				}
			}
		}).start();
//		
//		new Thread(() -> {
//			for (int i = 0; i < halfSize; i++) {
//				while(array.get(i).tryAdvance(value) -> printDetaile(value));
//			}			
//		});
//		split.tryAdvance((value) -> printDetail(value));
		
//		while (split.tryAdvance(value) -> printDetaile(value));
			
	}

	static void printDetaile(Shape s) {
		System.out.println("------------------------");
		System.out.println(s.name);
		System.out.println(s.size);

	}

	class Shape {
		String name;
		int size;

		public Shape(String name, int size) {
			this.name = name;
			this.size = size;
		}

	}
}
