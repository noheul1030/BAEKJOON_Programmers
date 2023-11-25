import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		String N = sc.next();
		int B = sc.nextInt();
		
		int tmp = 1;
		int result = 0;
		
		for(int i = 0; i < N.length(); i++) {
			char ch = N.charAt(N.length() - 1 - i);
			
			if('A'<= ch && ch <= 'Z') {
				result += ((int)ch - 55) * tmp;			
			}else {
				result += (ch - '0') * tmp;
			}
			
			tmp *= B;
		}
		
		System.out.println(result);
    }
}