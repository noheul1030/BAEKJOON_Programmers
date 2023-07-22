import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int[] i : queries){
            int cnt = 0;
            int cnt2 = i[0];
            while(cnt < answer.length && cnt2 <= i[1]){
                if(cnt2 % i[2] == 0) answer[cnt]++;
                cnt++;
                cnt2++;
            }
        }
        return answer;
    }
}