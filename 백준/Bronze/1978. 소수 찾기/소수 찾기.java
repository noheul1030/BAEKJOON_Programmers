import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if(result(m) == true) count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean result(int m) {
		if(m < 2) return false;
		
		if(m == 2) return true;
		
		for(int i = 2; i < m; i++) {
			if(m % i == 0) return false;		
		}
	
		return true;
	}
}