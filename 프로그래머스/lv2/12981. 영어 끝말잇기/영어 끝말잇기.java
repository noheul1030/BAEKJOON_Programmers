import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        int turn = 1;
        String lastWord = "";
        for(String word : words){
            if(turn == n + 1) turn = 1;
            map.put(turn,map.getOrDefault(turn, 0) + 1);
            if(list.contains(word)) return new int[] {turn, map.get(turn)};
            if(!list.isEmpty() && lastWord.charAt(lastWord.length()-1) != word.charAt(0))
                return new int[] {turn, map.get(turn)};
            list.add(word);
            lastWord = word;
            turn++;
        }

        return answer;
    }
}