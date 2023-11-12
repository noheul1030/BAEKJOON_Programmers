import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < b; i++){
			int aa = sc.nextInt();
			int bb = sc.nextInt();
			
			result += aa * bb;
		}
		
		if(a == result)	
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}