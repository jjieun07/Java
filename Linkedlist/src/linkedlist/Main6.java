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
		
		// 99�� �Է¹����� ����
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
			
			// ���
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
 * System.out.printf("ȣ����"); System.out.printf("�ڳ���\n");
 * System.out.printf("��\n����"); System.out.printf("��%d��%d��\n", 10, 20);
 * System.out.printf("��%03d��%04d��\n", 10, 20); System.out.printf("��%3d��%4d��",
 * 10, 20);
 */