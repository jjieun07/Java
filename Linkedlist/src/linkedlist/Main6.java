package linkedlist;

import java.util.*;

// partical program

class N {
	int num;
	int count;
	
	public N(int num) {
		this.num = num;
		this.count = 0;
	}
	
	
}
public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<N> list = new LinkedList();

		int n;
		int index = 0;
		
		// 99를 입력받으면 종료
		while(true) {
			int c = 0;
			n  = scan.nextInt();
			if(n == 99)
				break;
			
			int lSize = list.size();
			for(int i = 0; i < lSize; i++) {
				
				int random = (int)(Math.random() * 2);
				if(random == 0) {
					list.remove(c);
					c--;
				}else if(random == 1) {
					N nn = list.get(c);
					nn.count++;
				}
				c++;
			}
		
			
			int size = 10 - list.size();
			
			for(int i = 0; i < size; i++) {
				list.add(new N(index));
				index++;
			}
			
			// 출력
			for(int i = 0; i < list.size(); i++) {
				N nn = list.get(i);
				System.out.print(nn.num + " ");
			}System.out.println();
			
			for(int i = 0; i < list.size(); i++) {
				N nn = list.get(i);
				System.out.print(nn.count + " ");
			}
		}
		
		
	}
}

/*
 * System.out.printf("호랑이"); System.out.printf("코끼리\n");
 * System.out.printf("독\n수리"); System.out.printf("고%d양%d이\n", 10, 20);
 * System.out.printf("고%03d양%04d이\n", 10, 20); System.out.printf("고%3d양%4d이",
 * 10, 20);
 */