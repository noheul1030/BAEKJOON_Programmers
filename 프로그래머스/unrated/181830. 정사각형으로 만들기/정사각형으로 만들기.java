class Solution {
    public int[][] solution(int[][] arr) {
        int length = arr.length == arr[0].length ? arr[0].length : arr.length < arr[0].length ? arr[0].length : arr.length;
        int[][] answer = new int[length][length];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i > arr.length-1 || j > arr[0].length-1) answer[i][j] = 0;
                else answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}