class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] i : queries){
            for(int j = i[0]; j <= i[1]; j++){
                arr[j] += 1;
            }
        }
        int[] answer = arr;
        return answer;
    }
}