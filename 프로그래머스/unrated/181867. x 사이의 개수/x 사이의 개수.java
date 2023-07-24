import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(String s : myString.split("")){   
            if(s.equals("x")){
                list.add(count);
                count = 0;
            }else{
                count++;
            }
        }
        list.add(count);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}