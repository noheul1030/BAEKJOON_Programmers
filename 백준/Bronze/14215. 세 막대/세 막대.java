import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if(a > b) {
            if(b > c) max = a;
            else max = (a > c) ? a : c;
        }
        else max = (b > c) ? b : c;

        if(a + b + c - max > max) System.out.println(a + b + c);
        else System.out.print((a + b + c - max) * 2 - 1);
	}
}