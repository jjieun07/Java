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
      
      // boolean add(Object o) _ 객체 o를 끝에 추가, 저장에 성공하면 true, 아니면 false 반환
      System.out.println(list.add("123"));
      System.out.println(list);
      
      // void add(E o) _ 끝에 요소 추가
      list.add("Hello");
      list.add("World");
      System.out.println(list);
      
      // void add(int index, E element) _ index 위치에 추가 
      list.add(1, "Java");      
      System.out.println(list);
      
      // boolean addAll(Collection c) _ c에 포함된 모든 요소를 list 끝에 추가
      list2.add("1");
      list2.add("42");
      list2.add("32");
      
      list.addAll(list2);
      System.out.println(list);
      System.out.println(list.addAll(list2));
      
      // boolean addAll(int index, Collection c) _ c에 포함된 모든 요소를 list의 index 위치에 추가
      list.addAll(2, list2);
      System.out.println(list);
      
      // list2 첫번째 자리에 추가
      list2.addFirst("배고파요");
      System.out.println(list2);
      
      // list2 마지막 자리에 추가
      list2.addLast("I'm hungry");
      System.out.println(list2);
      
      // list의 모든 요소 삭제
      list.clear();
      System.out.println(list);
      
      // list2 복사 (Object로 반환되기 때문에 캐스팅 필요)
      list = (LinkedList<String>) list2.clone();
      System.out.println(list);
      
      // list에 요소가 포함되어 있으면 true 아니면 false
      System.out.println(list.contains("배고파요"));
      System.out.println(list.contains("스시"));

      // list의 요소를 마지막부터 읽음
      Iterator it1 = list.descendingIterator();
      System.out.print("descendingIteraot() : ");
      while(it1.hasNext()) {
         System.out.print(it1.next() + " ");
      }
      System.out.println();
      
      // list의 첫번째 요소 반환(삭제 ㄴㄴ)
      System.out.println(list.element());
      
      // list의 인덱스 위치에 있는 요소 반환
      System.out.println(list.get(2));

      // list의 첫번째 요소 반환
      System.out.println("getFirst() :" + list.getFirst());

      // list의 마지막 요소 반환
      System.out.println("getLast() : " + list.getLast());
      
      // list 요소가 나오는 첫번째 인덱스 값 반환
      System.out.println("indexOf : " + list.indexOf("배고파요"));
      
      // list 요소가 나오는 마지막 인덱스 값  반환
      System.out.println("lastIndexOf : " + list.lastIndexOf("1"));
      
      
      // ListIterator -> 양방향 이동 가능
      // index 위치부터 ListIterator 반환
      ListIterator listit = list2.listIterator(2);
      System.out.print("ListIterator : ");
      while(listit.hasNext()) {
         System.out.print(listit.next() + " ");
      }
      System.out.println();
      
      // 마지막 요소로 추가
      list.offer("33333");
      System.out.println(list);
      
      // 첫번째 요소로 추가
      list.offerFirst("offer");
      System.out.println("offer : " + list);
      
      // 마지막 요소로 추가
      list.offerLast("last");
      System.out.println("offerLast : " + list);
      
      // 첫번째  요소 반환
      System.out.println(list.peek());
      
      // 첫번째 요소 반환(삭제 ㄴㄴ)
      System.out.println(list.peekFirst());
      
      // 마지막 요소 반환(삭제 ㄴㄴ)
      System.out.println(list.peekLast());
      
      // 첫번째 요소 반환 후 삭제
      System.out.println("poll : " + list.poll());
      System.out.println(list);
      
      // 첫번재 요소 반환 후 삭제  (비어있을 경우 null 반환)
      System.out.println("pollFirst : " + list.pollFirst());
      System.out.println(list);
      
      // 마지막 요소 반환 후 삭제 (비어있을 경우 null 반환)
      System.out.println("pollLast : " + list.pollLast());
      System.out.println(list);
      
      // 첫번재 요소 삭제 (removeFirst와 동일)
      list.pop();
      System.out.println("pop : " + list);
      
      // 첫번째 요소로 추가
      list.push("push");
      System.out.println("push : " + list);
      
      // 첫번째 요소 삭제
      list.remove();
      System.out.println(list);
      
      // index 위치의 요소 삭제
      list.remove(2);
      System.out.println(list);
   
      // 첫번째로 일치하는 객체 제거
      list.add("32");
      System.out.println(list);
      list.remove("32");
      System.out.println(list);
      
      // 첫번재 요소 삭제
      list.removeFirst();
      System.out.println(list);
      
      // 첫번째로 일치하는 요소 제거
      list.removeFirstOccurrence("33333");
      System.out.println(list);
      
      // 마지막으로 일치하는 요소 제거
      System.out.println(list2);
      list2.removeLastOccurrence("배고파요");
      System.out.println(list2);
      
      // index 위치의 요소를 바꿈
      System.out.println(list2);
      list2.set(2,  "에어컨");
      System.out.println(list2);
      
      // list2의 크기 반환
      System.out.println("list2.size = " + list2.size());
      
      // list2의 요소를 배열로 반환
      String[] arr = (String[])list2.toArray();
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      
      // list의 요소를 주어진 객체에 저장하여 반환
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