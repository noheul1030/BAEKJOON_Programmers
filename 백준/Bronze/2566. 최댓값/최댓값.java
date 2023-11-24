import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		
		int[][] arr = new int[10][10];	

		int maxN = 1;
		int maxM = 1;
		int max = 0;
		
		for (int n = 0; n < 9; n++) {
			for (int m = 0; m < 9; m++) {
				arr[n][m] = sc.nextInt();
				
				if(arr[n][m] > max) {
					maxN = n+1;
					maxM = m+1;
					max = arr[n][m];
				}
			}
		}		
		
		System.out.println(max);
		System.out.print(maxN + " " + maxM);		
    }
}