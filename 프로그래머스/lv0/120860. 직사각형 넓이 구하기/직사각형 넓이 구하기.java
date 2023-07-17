class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < dots.length-1; i++){
            if(x <= Math.abs(dots[i][0]-dots[i+1][0])){
                x = Math.abs(dots[i][0]-dots[i+1][0]);
            }
            if(y <= Math.abs(dots[i][1]-dots[i+1][1])){
                y = Math.abs(dots[i][1]-dots[i+1][1]);
            }
        }
        
        return x * y;
     }
}