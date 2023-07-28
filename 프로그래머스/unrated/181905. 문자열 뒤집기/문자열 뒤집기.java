class Solution {
    public String solution(String mystring, int s, int e) {
        String answer = "";
        StringBuffer sb = new StringBuffer(mystring.substring(s,e+1));
        String re = sb.reverse().toString();
        answer = mystring.substring(0,s)+re+mystring.substring(e+1,mystring.length());
        
        return answer;
    }
}