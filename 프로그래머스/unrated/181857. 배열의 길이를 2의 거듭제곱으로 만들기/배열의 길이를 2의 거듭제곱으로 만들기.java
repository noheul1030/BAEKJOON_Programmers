class Solution {
    public int[] solution(int[] arr) {
        int s = 1;
        int l = arr.length;
        
        while(s < l){
            if(s >= l) break;
            s = s * 2;
        }
        int[] answer = new int[l + (s - l)];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}