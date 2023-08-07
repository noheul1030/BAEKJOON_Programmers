package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Test9 {

	public static void main(String[] args) {
		int num = 21;
		System.out.println("< 소수리스트 찾기 >\n");
		System.out.println(Solution(num));
		System.out.println();
		System.out.println("< 소인수분해 찾기 >\n");
		System.out.println(Solution2(num));
		
	}
	
	// n값까지 안에 있는 소수리스트 찾기
	public static List<Integer> Solution(int num) {		
		TreeSet<Integer> set = new TreeSet<>();		
		
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}else {
					set.add(i);
				}
			}
		}
		
		Iterator<Integer> iter = set.iterator();
		
		List<Integer> list = new ArrayList<>();
		while(iter.hasNext()) {
			list.add(iter.next());
		}		
		
		return list;
	}
	
	// n 값의 소인수 분해 구하기
	public static List<Integer> Solution2(int num){
		List<Integer> list = new ArrayList<>();
		
		int i = 2;
		while (num >= i) {
			if (num % i == 0) {
				num /= i;
				list.add(i);
			} else {
				i++;
			}
		}
		
		return list;
	}
}
