import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }
       
        int sum = 0;
        
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(String str : photo[i]){
                if(map.get(str) != null) sum += map.get(str);
            }
            answer[i] = sum;
            sum = 0;
        }
        return answer;
    }
}