import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int count = 0;
		int temp = 1;
		int N = 0;
		int num = 0;
        
		while(count < x) {
			count = count + temp;
			temp++;
		}
        
		if((temp-1)%2 == 0) {
			N = 1 + (count - x);
			num = (temp-1) - (count-x);
		}else {
			N = (temp-1) - (count-x);
			num = 1 + (count - x);
		}
		System.out.println(num  + "/" + N);
    }
}