import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result = 0;
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = i + 2; k < n; k++) {
					if(arr[i] + arr[j] + arr[k] <= m){
						if(result < arr[i] + arr[j] + arr[k]) {
							result = arr[i] + arr[j] + arr[k];
						}
					}
				}
			}
		}
		
		System.out.println(result);
	}
}