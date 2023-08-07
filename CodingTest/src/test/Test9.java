package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Test9 {

	public static void main(String[] args) {
		int num = 21;
		System.out.println("< �Ҽ�����Ʈ ã�� >\n");
		System.out.println(Solution(num));
		System.out.println();
		System.out.println("< ���μ����� ã�� >\n");
		System.out.println(Solution2(num));
		
	}
	
	// n������ �ȿ� �ִ� �Ҽ�����Ʈ ã��
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
	
	// n ���� ���μ� ���� ���ϱ�
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
