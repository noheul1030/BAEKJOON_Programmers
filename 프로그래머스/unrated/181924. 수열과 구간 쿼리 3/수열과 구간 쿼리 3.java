class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int[] i : queries){
            int temp = answer[i[0]];
            answer[i[0]] = answer[i[1]];
            answer[i[1]] = temp;
        }
        
        return answer;
    }
}