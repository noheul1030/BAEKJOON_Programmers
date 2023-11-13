import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;    
        }  
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp = arr[a-1];
			
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}
		
		for(int a : arr){
			System.out.print(a + " ");
		}
	}
}