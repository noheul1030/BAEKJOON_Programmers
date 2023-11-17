import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}