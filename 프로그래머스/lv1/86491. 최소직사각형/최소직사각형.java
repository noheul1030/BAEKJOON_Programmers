class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++){
            left = Math.max(left,sizes[i][0]);
            right = Math.max(right,sizes[i][1]);
        }
        return left * right;
    }
}