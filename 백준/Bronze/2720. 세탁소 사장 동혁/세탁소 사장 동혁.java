import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] coin = {25, 10, 5, 1};		
		
		for(int i = 0; i < n; i++) {
			int[] change = {0, 0, 0, 0};
			int input = sc.nextInt();
			int index = 0;
			
			while(input != 0) {
				if(index == coin.length) break;
				
				change[index] += input / coin[index];
				input = input % coin[index];
				
				if(input % coin[index] < coin[index]) index++;
			}

			for(int j : change) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
    }
}