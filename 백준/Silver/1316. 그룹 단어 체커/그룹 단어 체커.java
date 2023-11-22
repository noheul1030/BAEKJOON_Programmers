import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			List<Character> list = new ArrayList<>();
			String input = s.next();
			
			for(int j = 0; j < input.length(); j++) {
				if(!list.contains(input.charAt(j))) {
					list.add(input.charAt(j));
					if(j == input.length()-1) count++;
				}else {
					if(input.charAt(j-1) == (input.charAt(j))) {
						if(j == input.length()-1) count++;
						continue;
					}
					else break;				
				}
			}
		}
		
		System.out.println(count);
		
    }
}