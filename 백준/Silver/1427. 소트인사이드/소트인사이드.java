import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

		String str = sc.next();
		Integer[] arr = new Integer[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = (int) str.charAt(i) - '0';
		}

		Arrays.sort(arr, Collections.reverseOrder());
		String result = "";

		for (int i : arr) {
			result += Integer.toString(i);
		}

		System.out.println(result);
    }
}