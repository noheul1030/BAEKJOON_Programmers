import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return recursion(rank, attendance, 0, 1, 0);
    }
    
    public int recursion(int[] rank, boolean[] attendance, int cnt, int num, int answer){
        if(cnt == 3) return answer;
        
        for(int i = 0; i < rank.length; i++){
            if(num == rank[i] && attendance[i] == true){
                if(cnt == 0) answer += 10000 * i;
                if(cnt == 1) answer += 100 * i;
                if(cnt == 2) answer += i;
                
                return recursion(rank, attendance, cnt+1, num+1, answer);
            }
        }
        return recursion(rank, attendance, cnt, num+1, answer);
    }
}