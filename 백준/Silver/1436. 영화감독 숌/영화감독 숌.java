import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int number = 666;
		int cnt = 1;
		
		while (cnt != n) {
			number++;
			if (String.valueOf(number).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(number);
    }
}