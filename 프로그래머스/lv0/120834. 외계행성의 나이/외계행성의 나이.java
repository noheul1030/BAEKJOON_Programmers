class Solution {
    public String solution(int age) {
        String answer = "";
        String[] result = {"a","b","c","d","e","f","g","h","i","j"};
        
        while(age != 0){            
            answer = result[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }
}
