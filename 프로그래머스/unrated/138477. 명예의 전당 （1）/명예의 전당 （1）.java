import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }



        return answer;
        
        
//         List<Integer> list = new ArrayList<>();
//         int[] answer = new int[score.length];
        
//         int cnt = 0;
//         while(cnt < score.length){
//             for(int i = 0; i <= cnt; i++){
//                 if(list.size() < k){
//                     list.add(score[i]);
//                     Collections.sort(list);
//                     answer[i] = list.get(0);
//                 }else{
//                     list.add(score[i]);
//                     Collections.sort(list);
//                     Collections.reverse(list);
//                     answer[i] = list.get(k-1);
//                 }
//             }
//             cnt++;
//             list.clear();
//         }
//         return answer;
    }
}