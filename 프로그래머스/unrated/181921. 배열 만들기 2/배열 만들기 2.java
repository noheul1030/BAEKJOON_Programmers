import java.util.*;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        int test = l % 5;
        switch(test){
            case 1: l = l + 4; break;
            case 2: l = l + 3; break;
            case 3: l = l + 2; break;
            case 4: l = l + 1; break;
        }     
        for(int i = l; i <= r; i+=5){
            String str = i + "";
            
            if(!str.contains("1") && !str.contains("2") && !str.contains("3") && !str.contains("4")
              && !str.contains("6") && !str.contains("7") && !str.contains("8") && !str.contains("9"))
                answer.add(i);
        }
        
        if(answer.isEmpty()) answer.add(-1);
        return answer;
    }
}