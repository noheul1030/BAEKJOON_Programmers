import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			String str = sc.next();
			
			String result = "";
			for(String s : str.split("")){
				for(int j = 0; j < m; j++) {
					result = result + s;
				}
			}
			
			System.out.println(result);
		}
	}
}