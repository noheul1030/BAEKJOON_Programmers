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
            boolean b = true;
            String result = i + "";
            for(String str : result.split("")){
                if(!(str.equals("0") || str.equals("5"))) b = false;
                if(b == false) break;
            }                
            if(b == true) answer.add(i);
        }
        
        if(answer.isEmpty()) answer.add(-1);
        return answer;
    }
}