package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// 팩토리얼
		int fac = 5;
		int result = 1;
		
		for(int i = fac; i > 0; i--) {
			if(i !=0) {
			System.out.print(i+"*");
			}
			result = result * i;
		}
		System.out.println(" = "+result);		
		
		
		// 피보나치
		List<Integer> pibonachi = new ArrayList<Integer>();
		
		int temp1 = 0;
		int temp2 = 1;
		
		int temp3 = 0;
		
		pibonachi.add(temp1);
		pibonachi.add(temp2);
		
		for(int i = 0; i < 8; i++) {
			temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			pibonachi.add(temp3);
		}
		System.out.println(pibonachi);
		System.out.println(pibonachi.get(9));
	}

}
