import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.next();

        System.out.println(result(input));
		
    }
	
	public static int result(String input) {
		for(int i = 0; i < input.length() / 2; i++) {
			if(input.charAt(i) != input.charAt(input.length() -i -1)) return 0;
		}
		
		return 1;
	}
}