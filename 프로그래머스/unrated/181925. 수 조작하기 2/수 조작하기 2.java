class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i < numLog.length-1; i++){
            if(numLog[i] + 1 == numLog[i+1]) answer += "w";
            if(numLog[i] - 1 == numLog[i+1]) answer += "s";
            if(numLog[i] + 10 == numLog[i+1]) answer += "d";
            if(numLog[i] - 10 == numLog[i+1]) answer += "a";
        }
        return answer;
    }
}