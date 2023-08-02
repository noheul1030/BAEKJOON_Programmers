class Solution {
    public String solution(String s) {
        String answer = "";
        
        int index = 0;
        for(String str1 : s.split("")){
            answer += index % 2 == 0 ?
                str1.toUpperCase() : str1.toLowerCase();
            index++;
            
            if(str1.equals(" ")) index = 0;
        }
        return answer;
    }
}