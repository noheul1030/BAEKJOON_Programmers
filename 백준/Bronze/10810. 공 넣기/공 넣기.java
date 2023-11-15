import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		Arrays.fill(arr, 0);
		
		for(int i = 0; i < m; i++) {		
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();			
			
			for(int j = a-1; j < b; j++) {
				arr[j] = c;
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}		
	}
}
