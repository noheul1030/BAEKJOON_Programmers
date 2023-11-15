import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}		
		
		Arrays.sort(arr);
		
		double sum = Arrays.stream(arr).sum();		
		
		System.out.println((sum / arr[arr.length-1] * 100) / n);			
	}
}