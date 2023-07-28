package test;

import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        int[] A = { 6, 9, 5, 1, 12, 4, 8, 7, 2, 11, 10, 3 };
        
        //System.out.println(solution(A));
        
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(solution(arr));
    }
//    public static double solution(int[] numbers) {
//    	// 배열값들의 평균 구하고 null일 경우 0 반환
//    	return Arrays.stream(numbers).average().orElse(0);
//    }    
    
    public static int solution(int[] arr) {
        int answer = 0;
        
        int cnt = 0;
        int count = 0;
        while(true){
        	cnt++;
            for(int i = 0; i < arr.length; i++){
                int check = arr[i];
                if(check >= 50 && check % 2 == 0){
                    if(arr[i] != check / 2) count++;
                    arr[i] = check / 2;
                    
                }else if(check < 50 && check % 2 == 1){
                    if(arr[i] != check * 2 + 1) count++;
                    arr[i] = check * 2 + 1;
                }
            }
            
            if(count== 0)break;
            else count = 0;
        }
        System.out.println("cnt : " + cnt);
        if(arr[cnt]-2 == arr[cnt]-1) answer = cnt-2;
        
        System.out.println(answer);
        return answer;
    }
}
