class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String str1 = my_string.substring(num1,num1+1);
        String str2 = my_string.substring(num2,num2+1);
        int i = 0;
        for(String str : my_string.split("")){
            if(i == num1) answer = answer + str2;
            else if(i == num2) answer = answer + str1;
            else answer = answer + str;
            i++;
        }
        return answer;
    }
}