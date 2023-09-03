class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        String ss = "";
        int zeroCount = 0;
        int count = 0;
        while(true){
            if(s.equals("1")) break;
            if(!s.equals("1")){
                count++;
                for(String str : s.split("")){
                    if(str.equals("0")) zeroCount++;
                    else ss = ss + str;
                }
                s = Integer.toString(ss.length(),2);
                ss = "";
            }
        }
        
        answer[0] = count;
        answer[1] = zeroCount;
        
        return answer;
    }
}