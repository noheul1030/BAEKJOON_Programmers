import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			if(a == -1) break;
			else System.out.println(result(a));
		}
	}
	
	public static String result(int a) {
	
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i < a; i++) {
			if(a % i == 0) list.add(i);		
		}
		
		if(list.stream().mapToInt(i -> i).sum() == a) {
			String str = a + " = ";
			
			for(int i : list) {
				str = str + i + " + ";
			}
			
			return str.substring(0, str.length()-2);
		}else {
			return a + " is NOT perfect.";
		}
	}
}