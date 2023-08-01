class Solution {
    public int solution(int balls, int share) {
        return recursion(balls,share);
    }
    
    public int recursion(int balls, int share){
        if(balls == share || share == 0) return 1;
        
        return recursion(balls-1, share-1) + recursion(balls-1, share);
    }
}