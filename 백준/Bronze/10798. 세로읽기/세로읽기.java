import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		
		char[][] arr = new char[5][15];
		for(char[] c : arr) {
			Arrays.fill(c, ' ');
		}
		
		String result = "";
		
		for (int n = 0; n < 5; n++) {
			String input = sc.nextLine();
			
			for (int m = 0; m < input.length(); m++) {
				arr[n][m] = input.charAt(m);
			}
		}
		
		for(int m = 0; m < 15; m++) {
			for(int n = 0; n < 5; n++) {
				if(arr[n][m] != ' ') {
					System.out.print(arr[n][m]);
				}
			}
		}
    }
}