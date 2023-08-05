import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : score){
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        for(int i = 0; i< score.length; i++){
            score[i] = list.get(i);
        }
        
        for(int i = 0,j = 0; i < score.length; i+=m){
            if(i+m <= score.length){
                int[] min = Arrays.copyOfRange(score,i,i+m);
                answer += Arrays.stream(min).min().getAsInt() * m;
            }
        }
        return answer;
    }
}