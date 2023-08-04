import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int one = 0, two = 0, three = 0;
        
        int RoundCount = 0;
        
        String score = "";
        
        while(dartResult.length() > 0){
            // 숫자 컷팅
            if(Character.isDigit(dartResult.charAt(0))){
                if(Character.isDigit(dartResult.charAt(1))){
                    score = dartResult.substring(0,2);
                    dartResult = dartResult.substring(2);
                    RoundCount++;
                }else{
                    score = dartResult.substring(0,1);
                    dartResult = dartResult.substring(1);
                    RoundCount++;
                }
                // System.out.println("score : " + score);
                continue;
            }else{ // 숫자 아닐 때
                char cha = dartResult.charAt(0);
                if(!score.equals("")){
                    if(RoundCount == 1) one = Integer.parseInt(score);
                    if(RoundCount == 2) two = Integer.parseInt(score);
                    if(RoundCount == 3) three = Integer.parseInt(score);
                    score = "";
                } 
                
                if(RoundCount == 1){
                    if(cha == 'S') one = one;
                    else if(cha == 'D') one = (int)Math.pow(one,2);
                    else if(cha == 'T') one = (int)Math.pow(one,3);
                    if(cha == '*') one = one * 2;
                    else if(cha == '#') one = one * -1;
                }else if(RoundCount == 2){
                    if(cha == 'S') two = two;
                    else if(cha == 'D') two = (int)Math.pow(two,2);
                    else if(cha == 'T') two = (int)Math.pow(two,3);

                    if(cha == '*'){
                        one = one * 2;
                        two = two * 2;
                    }else if(cha == '#'){
                        two = two * -1;
                    }
                }else if(RoundCount == 3){
                    if(cha == 'S') three = three;
                    else if(cha == 'D') three = (int)Math.pow(three,2);
                    else if(cha == 'T') three = (int)Math.pow(three,3);

                    if(cha == '*'){
                        two = two * 2;
                        three = three * 2;
                    }else if(cha == '#'){
                        three = three * -1;
                    }
                }
                dartResult = dartResult.substring(1);
            
                // System.out.println("RoundCount : " + RoundCount);
                // System.out.println("cha : " + cha);
                // System.out.println("one : " + one + ", two : " + two + ", three : " + three);
            }
        }
        return one + two + three;
    }
}