import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int cnt = 0;
        for(int[] i : queries){
            List<Integer> list = new ArrayList<>();
            for(int j = i[0]; j <= i[1]; j++){
                if(i[2] < arr[j]) list.add(arr[j]);
            }
            Collections.sort(list);
            if(list.isEmpty()) answer[cnt] = -1;
            else answer[cnt] = list.get(0);
            cnt++;
        }
        return answer;
    }
}