import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        
        
        
//         List<Character> list = new ArrayList<>();
//         int[] answer = new int[s.length()];        
        
//         for(int i = 0; i < s.length(); i++){
//             if(!list.contains(s.charAt(i))){
//                 list.add(s.charAt(i));
//                 answer[i] = -1;
//             }else{
//                 int count = 1;
//                 for(int j = i-1; j >= 0; j--){
//                     if(s.charAt(i) == s.charAt(j)){
//                         answer[i] = count;
//                         break;
//                     }else count++;
//                 }
//             }
//         }
        return answer;
    }
}