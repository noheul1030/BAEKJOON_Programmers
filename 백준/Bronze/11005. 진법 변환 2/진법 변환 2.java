import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		String result = "";
		
		while(N != 0) {
			int n = N % B;
			
			if(n > 9) {
				n += (int)'A' - 10;
				result = Character.toString((char)n) + result;
			} else {
				result = Integer.toString(n) + result;
			}
			
			N /= B;
		}
		
		System.out.println(result);
    }
}