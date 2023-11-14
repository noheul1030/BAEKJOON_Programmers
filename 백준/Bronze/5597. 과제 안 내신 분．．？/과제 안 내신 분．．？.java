import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 28; i++) {
			list.add(sc.nextInt());
        }
		Collections.sort(list);
		
		for(int i = 1; i <= 30; i++) {
			if(!list.isEmpty() && list.get(0) == i){
				list.remove(0);
			} else {
				System.out.println(i);
			}
		}
	}
}