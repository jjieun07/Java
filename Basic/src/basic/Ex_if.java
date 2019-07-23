package basic;

import java.util.Random;

public class Ex_if {
	public static void main(String[] args) {

		/*
		 * int a = 10; int b;
		 * 
		 * if(a > 0) { b = 3; }else { b = 4; }
		 * 
		 * b = a>0? 3:4;
		 * 
		 * if(a > 0) { System.out.println("호랑이"); }else { System.out.println("코끼리"); }
		 * 
		 * System.out.println(a>0? "호랑이":"코끼리");
		 */
		
		//**************** 세 수 중 가운데 값 구하기 ****************//
			int a = 1, b = 2, c = 3;
		 
		// int a = 1, b = 3, c = 2;
		// int a = 2, b = 1, c = 3;
		// int a = 2, b = 3, c = 1;
		// int a = 3, b = 1, c = 2;
		// int a = 3, b = 2, c = 1;

			
			
		/*
		 * int max, mid, min;
		 * 
		 * 
		 * if(a > b) { max = a; min = b; }else { max = b; min = a; }
		 * 
		 * if(c > max) { mid = max; max = c; } else if(c < min) { mid = min; min = c;
		 * }else mid = c;
		 * 
		 * System.out.println(mid);
		 */

		/*
		 * int m;
		 * 
		 * if(a > b) { // a = max or a = mid if(a > c) { // a = max if(b > c) { // b =
		 * mid m = b; }else { // c = mid m = c; } }else { // a = mid m = a; } }else { //
		 * a = mid or a = min if(a < c) { // a = min if(b > c){ m = c; }else { m = b; }
		 * } else { m = a; } }
		 * 
		 * System.out.println(m);
		 */

		/*
		 * int m;
		 * 
		 * if (a > b) { // a = max or a = mid if (a > c) { // a = max //m = b>c? b:c; m
		 * = Math.max(b, c); } else { // a = mid m = a; } } else { // a = mid or a = min
		 * if (a < c) { // a = min //m = b<c? c:b; m = Math.min(b, c); } else { m = a; }
		 * }
		 */

		/*
		 * int m;
		 * 
		 * if (a > b) { // a = max or a = mid m = a>c? Math.max(b, c):a; } else { // a =
		 * mid or a = min m = a<c? Math.min(b, c):a; }
		 */

		int m;

		m = a > b ? (a > c ? Math.max(b, c) : a) : (a < c ? Math.min(b, c) : a);

		System.out.println(m);

	}
}
