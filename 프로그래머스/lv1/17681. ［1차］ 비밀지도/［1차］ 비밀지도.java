import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr11 = new String[arr1.length];
        String[] arr22 = new String[arr2.length];
        String[] answer = new String[arr11.length];
        
        for(int i = 0; i < arr1.length; i++){
            String str1 = Integer.toString(arr1[i],2);
            String str2 = Integer.toString(arr2[i],2);
            while(str1.length() < arr1.length){
                str1 = "0" + str1;
            }
            while(str2.length() < arr2.length){
                str2 = "0" + str2;
            }
            arr11[i] = str1;
            arr22[i] = str2;            
        }
        
        for(int i = 0; i < arr11.length; i++){
            String str = "";
            for(int j = 0; j < arr11[i].length(); j++){
                if(arr11[i].charAt(j) == '1' || arr22[i].charAt(j) == '1'){
                    str += "#";
                }else{
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}