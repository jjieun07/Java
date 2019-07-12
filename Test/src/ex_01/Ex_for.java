package ex_01;

public class Ex_for {
	public static void main(String[] args) {
		for(int i = 5; i < 9; i++) {		// 이런 for문은 응용/활용 안됨 (쓸 경우 -> 메모리나 속도 부분에서 기하급수적으로 변화가 있을때)
			System.out.println(i);
		}
		
		//**************************************//
		
		
		int s = 5, e = 8;
		int size = e-s+1;
		
		for(int i = 0; i < size; i++) {
			System.out.println(5+i);
		}
		
		
		//**************************************//
		
		//**************************************//
		//일종의 슈가코드
		int i = 0;
		for(i = 0; i < 5; i++);		// for문에서 {}를 생략할 수 있는 경우 -> 한문장 이하일 때
		System.out.println(i + 10);	// 최종변수를 다음 프로그램에서 사용할 때 필요
	}
}
