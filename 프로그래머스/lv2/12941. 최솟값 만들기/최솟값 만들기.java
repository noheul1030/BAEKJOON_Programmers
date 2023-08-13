import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        int answer = 0;
        
        for(int i : A){listA.add(i);}
        for(int i : B){listB.add(i);}
        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);
        
        for(int i = 0; i < listA.size(); i++){
            answer+= listA.get(i) * listB.get(i);
        }
        return answer;
    }
}