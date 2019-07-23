package basic;

import java.util.*;

public class Ex_while {
	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
		
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		
		while(true) {
			n = n%2==0?n/2:n*3+1;
			
			if(n == 1) break;
			
			count++;
		}
		System.out.println(count);
	}
}