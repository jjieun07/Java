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
//			list.add(new A(random, "호랑이" + i));
//		}		
		
		// float로 정렬 할 때 ex1(ex2)로 쓸 수 밖에 없다!
		list.add(new A(0.11f, "호랑이0"));
		list.add(new A(0.21f, "호랑이1"));
		list.add(new A(0.52f, "호랑이2"));
		list.add(new A(0.66f, "호랑이3"));
		list.add(new A(0.48f, "호랑이4"));
		
		for(A item:list) {
			item.output();
		}
		
		System.out.println("----------sort-----------");
		// Collections -> 클래스 내부에 static 함수가 있다 -> 객체를 만들 필요가 없다.
		// Collections.sort(정렬할 객체, new Comparator('익명함수')), 
		// Comparator -> interface -> 함수 구현 필요 (익명함수)
		
		// ex1
//		Collections.sort(list, new Comparator<A>() {
//			@Override
//			// quick sort
//			public int compare(A o1, A o2) {
//				// 부등호 부호를 바꾸면 내림차순
//				// 순차정렬 발생
//				// 1과 +1은 다르다...?
//				if(o1.n > o2.n) {
//					return 1;	// 양수의 대명사를 1로 본다
//				} else
//					return -1;
//			}
//		});
		
		// ex2 _ 삼항연산
//		Collections.sort(list, new Comparator<A>() {
//			public int compare(A o1, A o2) {
//				return o1.n>o2.n ? 1:-1;	
//			}
//		});
		
		// ex3
//		Collections.sort(list, new Comparator<A>() {
//			public int compare(A o1, A o2) {
//				// return 값으로 양수를 반환하는지 음수를 반환하는지가 문제
//				return  o1.n - o2.n;	
//			}
//		});
		
		
		// ex4 _ 람다
//		Collections.sort(list, (o1, o2) -> {
//			return o1.n - o2.n;
//		});
		
		
		// ex5 _ 람다 -> n의 자료형이 int 일때 성립
//		Collections.sort(list, (o1, o2) ->  o1.n - o2.n);
		
		
		for(A item:list) {
			item.output();
		}
	}
}
