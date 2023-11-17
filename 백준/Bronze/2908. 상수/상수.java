import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String aa = new StringBuilder(a.substring(0, 3)).reverse().toString();
        String bb = new StringBuilder(b.substring(0, 3)).reverse().toString();
		
		if(Integer.parseInt(aa) < Integer.parseInt(bb)) System.out.println(bb);
		else System.out.println(aa);
	}
}