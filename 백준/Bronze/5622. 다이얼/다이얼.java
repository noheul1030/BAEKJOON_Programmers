import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("");
		
		int result = 0;
		for(String s : a) {
			if("ABC".contains(s)) result += 3;
			else if("DEF".contains(s)) result += 4;
			else if("GHI".contains(s)) result += 5;
			else if("JKL".contains(s)) result += 6;
			else if("MNO".contains(s)) result += 7;
			else if("PQRS".contains(s)) result += 8;
			else if("TUV".contains(s)) result += 9;		
			else if("WXYZ".contains(s)) result += 10;			
		}
		
		System.out.println(result);
	}
}