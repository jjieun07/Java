package myLinkedList;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("fw");
		list.add("gew");
		list.add("jrdr");
		list.add("jtr64");
		list.add("jt6o75");
		System.out.println(list);
		
		list.delete();
		
		System.out.println(list);
		
		
		System.out.println(list.get(0));
		
		list.set(0, "gewhe");
		System.out.println(list);
	}
}
