import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] arr = {0,0,0};
        
        int RoundCount = 0;        
        String score = "";
        
        while(dartResult.length() > 0){
            // 숫자 컷팅
            if(Character.isDigit(dartResult.charAt(0))){
                if(Character.isDigit(dartResult.charAt(1))){
                    score = dartResult.substring(0,2);
                    dartResult = dartResult.substring(2);
                }else{
                    score = dartResult.substring(0,1);
                    dartResult = dartResult.substring(1);
                }
                RoundCount++;
            }else{ // 숫자 아닐 때
                char cha = dartResult.charAt(0);
                if(!score.equals("")){
                    if(RoundCount == 1) arr[0] = Integer.parseInt(score);
                    else if(RoundCount == 2) arr[1] = Integer.parseInt(score);
                    else if(RoundCount == 3) arr[2] = Integer.parseInt(score);
                    score = "";
                } 
                
                SDT(arr,cha,RoundCount);
                SDT2(arr,cha,RoundCount);
                
                dartResult = dartResult.substring(1);
            }
        }
        return arr[0] + arr[1] + arr[2];
    }
    // SDT 계산
    public void SDT(int[] arr, char cha, int round){
        arr[round - 1] = cha == 'D' ? (int) Math.pow(arr[round - 1],2) : cha == 'T' ? (int)Math.pow(arr[round - 1],3) : arr[round - 1];
    }
    // *, # 계산
    public void SDT2(int[] arr, char cha, int round){
        if(cha == '#') arr[round - 1] = arr[round - 1] * -1;
        else if(cha == '*'){
            if(round == 1) arr[round - 1] = arr[round - 1] * 2;
            else {
                arr[round - 1] = arr[round - 1] * 2;
                arr[round - 2] = arr[round - 2] * 2;
            }
        }   
    }
    
}