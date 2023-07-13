import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++){            
            while(n % i == 0){
                set.add(i);
                n /=  i;
            } 
        }
        for(int num : set){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}