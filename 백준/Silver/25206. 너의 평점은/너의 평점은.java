import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
		double d = 0;
		double sum = 0;
		
		for(int i = 0; i < 20; i++) {
			String input = s.nextLine();		
			String[] arr = input.split(" ");
			
			double score = Double.parseDouble(arr[1]);
			
			if(!arr[2].equals("P")){
				sum += score;
				
				if(arr[2].equals("A+")) {
					d += score * 4.5;
				}else if(arr[2].equals("A0")) {
					d += score * 4.0;
				}else if(arr[2].equals("B+")) {
					d += score * 3.5;
				}else if(arr[2].equals("B0")) {
					d += score * 3.0;
				}else if(arr[2].equals("C+")) {
					d += score * 2.5;
				}else if(arr[2].equals("C0")) {
					d += score * 2.0;
				}else if(arr[2].equals("D+")) {
					d += score * 1.5;
				}else if(arr[2].equals("D0")) {
					d += score * 1.0;
				}else if(arr[2].equals("F")) {
					d += score * 0.0;
				}
			}
		}		
		System.out.printf("%.6f",d / sum);
    }
}