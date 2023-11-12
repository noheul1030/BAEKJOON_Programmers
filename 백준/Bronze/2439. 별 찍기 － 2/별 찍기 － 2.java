import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 1;
		
		for(int i = a; i > 0; i--) {
			for(int j = 0; j < i-1; j++){				
				System.out.print(" ");
			}
			for(int k = 0; k < b; k++){
				System.out.print("*");
			}
		b++;
		System.out.println();
		}
	}
}