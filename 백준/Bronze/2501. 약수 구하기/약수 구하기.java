import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		String[] s = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		System.out.println(result(a,b));
	}
	
	public static int result(int a, int b) {
	
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) list.add(i);		
		}
		
		if(!list.isEmpty() && b <= list.size()) return list.get(b-1);
		else return 0;
	}
}