class Solution {
    public String solution(String mystring, int s, int e) {
        StringBuffer sb = new StringBuffer(mystring.substring(s,e+1)).reverse();
        
        return mystring.substring(0,s)+ sb +mystring.substring(e+1,mystring.length());
    }
}