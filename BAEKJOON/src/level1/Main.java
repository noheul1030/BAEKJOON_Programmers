package level1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = 0;
		
		
		System.out.println(A* (B%10));
		C = B/10;
		System.out.println(A* (C%10));
		C = C/10;
		System.out.println(A*C);
		System.out.println(A*B);
	}
}
