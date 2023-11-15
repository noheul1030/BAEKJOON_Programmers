import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = 0;
		
		for(String s : str.split("")){
			if(Pattern.matches("^[a-zA-Z]*$", s)){
				n++;
			}
		}
		System.out.println(n);
	}
}
