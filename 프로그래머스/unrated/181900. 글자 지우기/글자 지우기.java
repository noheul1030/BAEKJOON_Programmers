class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(int i = 0; i < indices.length; i++){
            str[indices[i]] = "0";
        }
        for(String i : str){
            if(!(i.equals("0"))) answer+=i;
        }
        
        
        return answer;
    }
}