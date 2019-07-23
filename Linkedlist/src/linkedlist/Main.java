package linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<String>();
      LinkedList<String> list2 = new LinkedList<String>();
      LinkedList list3 = new LinkedList();
      
      // boolean add(Object o) _ ��ü o�� ���� �߰�, ���忡 �����ϸ� true, �ƴϸ� false ��ȯ
      System.out.println(list.add("123"));
      System.out.println(list);
      
      // void add(E o) _ ���� ��� �߰�
      list.add("Hello");
      list.add("World");
      System.out.println(list);
      
      // void add(int index, E element) _ index ��ġ�� �߰� 
      list.add(1, "Java");      
      System.out.println(list);
      
      // boolean addAll(Collection c) _ c�� ���Ե� ��� ��Ҹ� list ���� �߰�
      list2.add("1");
      list2.add("42");
      list2.add("32");
      
      list.addAll(list2);
      System.out.println(list);
      System.out.println(list.addAll(list2));
      
      // boolean addAll(int index, Collection c) _ c�� ���Ե� ��� ��Ҹ� list�� index ��ġ�� �߰�
      list.addAll(2, list2);
      System.out.println(list);
      
      // list2 ù��° �ڸ��� �߰�
      list2.addFirst("����Ŀ�");
      System.out.println(list2);
      
      // list2 ������ �ڸ��� �߰�
      list2.addLast("I'm hungry");
      System.out.println(list2);
      
      // list�� ��� ��� ����
      list.clear();
      System.out.println(list);
      
      // list2 ���� (Object�� ��ȯ�Ǳ� ������ ĳ���� �ʿ�)
      list = (LinkedList<String>) list2.clone();
      System.out.println(list);
      
      // list�� ��Ұ� ���ԵǾ� ������ true �ƴϸ� false
      System.out.println(list.contains("����Ŀ�"));
      System.out.println(list.contains("����"));

      // list�� ��Ҹ� ���������� ����
      Iterator it1 = list.descendingIterator();
      System.out.print("descendingIteraot() : ");
      while(it1.hasNext()) {
         System.out.print(it1.next() + " ");
      }
      System.out.println();
      
      // list�� ù��° ��� ��ȯ(���� ����)
      System.out.println(list.element());
      
      // list�� �ε��� ��ġ�� �ִ� ��� ��ȯ
      System.out.println(list.get(2));

      // list�� ù��° ��� ��ȯ
      System.out.println("getFirst() :" + list.getFirst());

      // list�� ������ ��� ��ȯ
      System.out.println("getLast() : " + list.getLast());
      
      // list ��Ұ� ������ ù��° �ε��� �� ��ȯ
      System.out.println("indexOf : " + list.indexOf("����Ŀ�"));
      
      // list ��Ұ� ������ ������ �ε��� ��  ��ȯ
      System.out.println("lastIndexOf : " + list.lastIndexOf("1"));
      
      
      // ListIterator -> ����� �̵� ����
      // index ��ġ���� ListIterator ��ȯ
      ListIterator listit = list2.listIterator(2);
      System.out.print("ListIterator : ");
      while(listit.hasNext()) {
         System.out.print(listit.next() + " ");
      }
      System.out.println();
      
      // ������ ��ҷ� �߰�
      list.offer("33333");
      System.out.println(list);
      
      // ù��° ��ҷ� �߰�
      list.offerFirst("offer");
      System.out.println("offer : " + list);
      
      // ������ ��ҷ� �߰�
      list.offerLast("last");
      System.out.println("offerLast : " + list);
      
      // ù��°  ��� ��ȯ
      System.out.println(list.peek());
      
      // ù��° ��� ��ȯ(���� ����)
      System.out.println(list.peekFirst());
      
      // ������ ��� ��ȯ(���� ����)
      System.out.println(list.peekLast());
      
      // ù��° ��� ��ȯ �� ����
      System.out.println("poll : " + list.poll());
      System.out.println(list);
      
      // ù���� ��� ��ȯ �� ����  (������� ��� null ��ȯ)
      System.out.println("pollFirst : " + list.pollFirst());
      System.out.println(list);
      
      // ������ ��� ��ȯ �� ���� (������� ��� null ��ȯ)
      System.out.println("pollLast : " + list.pollLast());
      System.out.println(list);
      
      // ù���� ��� ���� (removeFirst�� ����)
      list.pop();
      System.out.println("pop : " + list);
      
      // ù��° ��ҷ� �߰�
      list.push("push");
      System.out.println("push : " + list);
      
      // ù��° ��� ����
      list.remove();
      System.out.println(list);
      
      // index ��ġ�� ��� ����
      list.remove(2);
      System.out.println(list);
   
      // ù��°�� ��ġ�ϴ� ��ü ����
      list.add("32");
      System.out.println(list);
      list.remove("32");
      System.out.println(list);
      
      // ù���� ��� ����
      list.removeFirst();
      System.out.println(list);
      
      // ù��°�� ��ġ�ϴ� ��� ����
      list.removeFirstOccurrence("33333");
      System.out.println(list);
      
      // ���������� ��ġ�ϴ� ��� ����
      System.out.println(list2);
      list2.removeLastOccurrence("����Ŀ�");
      System.out.println(list2);
      
      // index ��ġ�� ��Ҹ� �ٲ�
      System.out.println(list2);
      list2.set(2,  "������");
      System.out.println(list2);
      
      // list2�� ũ�� ��ȯ
      System.out.println("list2.size = " + list2.size());
      
      // list2�� ��Ҹ� �迭�� ��ȯ
      String[] arr = (String[])list2.toArray();
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      
      // list�� ��Ҹ� �־��� ��ü�� �����Ͽ� ��ȯ
      String[] arr2 = new String[10];
      list.toArray(arr2);
      for(int i = 0; i < arr2.length; i++) {
         System.out.print(arr2[i] + " ");
      }
      System.out.println();
      
      list3.add(3);
      list3.add("list3");
      list3.add('e');
      list3.add(3.333);
      list3.add(list2);
      
      System.out.println("list3 = " + list3);
   }
}