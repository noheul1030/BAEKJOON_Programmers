
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result1 = 0;
        int result2 = 1;
        for(int i : num_list){
            result1 += i;
            result2 *= i;
        }        
        return result2 < result1 * result1 ? 1 : 0;
    }
}