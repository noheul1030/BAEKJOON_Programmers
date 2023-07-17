import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(2);
        for(int i = 3; i <=n; i=i+2){
            int cnt = 0;
            for(int tmp : result){
                if(tmp * tmp > i) break;
                if(i % tmp == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) {
                result.add(i);
            }            
        }
        return result.size();
    }
}