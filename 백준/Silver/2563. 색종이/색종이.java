import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		
		int[][] arr = new int[100][100];
		
		for(int[] a : arr) {
			Arrays.fill(a, 0);
		}
		
		for(int i = 0; i < n; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			for(int x = X; x < X+10; x++) {
				for(int y = Y; y < Y+10; y++) {
					arr[x][y] = 1;
				}			
			}		
		}
		
		int count = 0;
		
		for(int[] i : arr) {
			for(int j : i) {
				if(j == 1) count++;
			}
		}
		
		System.out.println(count);
    }
}