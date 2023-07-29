import java.math.BigDecimal;

class Solution {
    public String solution(String a, String b) {
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        
        String answer = String.valueOf(a1.add(b1));
        
        return answer;
    }
}