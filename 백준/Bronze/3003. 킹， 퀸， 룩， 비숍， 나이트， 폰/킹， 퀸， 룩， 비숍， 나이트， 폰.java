import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[chess.length];
		
		for(int i = 0; i < chess.length; i++) {
			int input = s.nextInt();
			if(chess[i] == input) {
				arr[i] = 0;
			} else {
				arr[i] = chess[i] - input;
			} 
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}