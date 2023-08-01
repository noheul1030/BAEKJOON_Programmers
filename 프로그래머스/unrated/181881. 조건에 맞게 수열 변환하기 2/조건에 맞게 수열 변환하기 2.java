class Solution {
    public int solution(int[] arr) {
        return recursion(arr, 0);
    }
    
    public int recursion(int[]arr, int cnt){
        int[] re = new int[arr.length];
        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                if(arr[i] >= 50){
                    re[i] = arr[i] / 2;
                    count++;
                }
            }else{
                if(arr[i] < 50){
                    re[i] = arr[i] * 2 + 1;
                    count++;
                }
            }
        }
        
        if(count == 0) return cnt;
        else {
            return recursion(re, cnt + 1);
        }
    }
}