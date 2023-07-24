class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int answer = 0;
        for(int i = 1; i < str.length; i+=2){
            if(str[i].equals("+")) answer = Integer.parseInt(str[i-1]) + Integer.parseInt(str[i+1]);
            if(str[i].equals("-")) answer = Integer.parseInt(str[i-1]) - Integer.parseInt(str[i+1]);
            if(str[i].equals("*")) answer = Integer.parseInt(str[i-1]) * Integer.parseInt(str[i+1]);
        }
        return answer;
    }
}