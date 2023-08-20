import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0) 
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함 
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else 
                order[i] = numlist[i] - n; 
        }

        Arrays.sort(order); // 오름차순 정렬

        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];
            else answer[i] = (int)order[i] + n;
        }

        return answer;

//아래의 방법으로는 TEST 2 항목만을 통과하지 못했다. 이유가 뭘까?
        
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();
        
//         Arrays.sort(numlist);
        
//         for(int i : numlist){
//             if(i <= n) list1.add(i);
//             else if(i > n) list2.add(i);
//         }
//         Collections.reverse(list1);
//         int max = Math.max(list1.size(),list2.size());
        
//         List<Integer> answer = new ArrayList<>();
//         for(int i = 0; i < max; i++){
//             if(list1.size() != 0 && list2.size() != 0){
//                 int n1 = Math.abs(n - list1.get(0));
//                 int n2 = Math.abs(n - list2.get(0));
//                 if(n1 < n2){
//                     answer.add(list1.get(0));
//                     list1.remove(0);
//                 }else if(n1 > n2){
//                     answer.add(list2.get(0));
//                     list2.remove(0);
//                 }else if(n1 == n2){
//                     answer.add(list2.get(0));
//                     answer.add(list1.get(0));
//                     list2.remove(0);
//                     list1.remove(0);
//                 }
//             }
//         }
//         if(list1.size() != 0){
//             for(int i : list1){
//                 answer.add(i);
//             }
//         }
//         if(list2.size() != 0){
//             for(int i : list2){
//                 answer.add(i);
//             }
//         }
//         return answer.stream().mapToInt(i -> i).toArray();
    }
}