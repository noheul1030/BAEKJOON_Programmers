class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String ss = "";
        int zeroCount = 0;
        int count = 0;
        
        while(true){
            if(s.equals("1")) break;
            else{
                count++;
                
                for(String str : s.split("")){
                    if(str.equals("0")) zeroCount++;
                    else ss = ss + str;
                }
                
                s = Integer.toString(ss.length(),2);
                ss = "";
            }
        }
        
        return new int[]{count,zeroCount};
    }
}