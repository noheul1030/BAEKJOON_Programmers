package test;

import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        int[] A = { 6, 9, 5, 1, 12, 4, 8, 7, 2, 11, 10, 3 };
        
        System.out.println(solution(A));
    	
    }
    public static double solution(int[] numbers) {
    	// �迭������ ��� ���ϰ� null�� ��� 0 ��ȯ
    	return Arrays.stream(numbers).average().orElse(0);
    }    
}
