import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        HashMap<String,Integer> map = new HashMap<>();
        
        String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                        "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                        "a","b","c","d","e","f","g","h","i","j","k","l","m",
                        "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(String s : arr){
            map.put(s,0);
        }
        for(String s : my_string.split("")){
            map.put(s,map.getOrDefault(s, 0) + 1);
        }
        
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = map.get(arr[i]);
        }
        return answer;
    }
}