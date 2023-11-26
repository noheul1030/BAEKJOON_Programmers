import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int box = 1;
		
		for(int i = 0; i < N; i++) {
			box *= 2;			
		}
		
		System.out.println((box + 1) * (box + 1));
    }
}