import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();	
		
		System.out.println(box(N));
    }
	
	public static int box(int N) {
		int start = 1;
		int count = 0;		
	
		if(N == 1) return N;
		
		while(true) {
			count++;
			start = start + (count * 6);
			
			if(start - (count * 6) < N && N <= start) return count+1;
		}	
	}
}