class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String coffee : order){
            if(coffee.contains("americano") || coffee.contains("anything")) answer += 4500;
            else answer += 5000;
        }
        return answer;
    }
}