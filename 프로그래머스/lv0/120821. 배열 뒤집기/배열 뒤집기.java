import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int[] num_list) {    
        int leng = num_list.length;
        int[] answer = new int[leng];
        for(int num : num_list){
            leng--;
            answer[leng] = num;            
        }
        return answer;
    }
}