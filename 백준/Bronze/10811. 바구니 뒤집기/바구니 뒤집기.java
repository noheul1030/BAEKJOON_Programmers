import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 1; i <= n; i++) {
			arr[i-1] = i;
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == b) continue;
			else {
				int[] cut = Arrays.copyOfRange(arr, a-1, b);
				int count = 0;
				for (int j = b-1; j >= a-1; j--) {
					arr[j] = cut[count];
					count++;
				}
			}
        }		
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
