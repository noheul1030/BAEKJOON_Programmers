import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        int[] x = {1,0,-1,0};
        int[] y = {0,1,0,-1};
        
        for(String key : keyinput){
            if(key.equals("right")){
                if(Math.abs(answer[0] + x[0]) <= Math.abs(board[0]/2)) answer[0] += x[0];
                if(Math.abs(answer[1] + y[0]) <= Math.abs(board[1]/2)) answer[1] += y[0];
            }
            if(key.equals("up")){
                if(Math.abs(answer[0] + x[1]) <= Math.abs(board[0]/2)) answer[0] += x[1];
                if(Math.abs(answer[1] + y[1]) <= Math.abs(board[1]/2)) answer[1] += y[1];
            }
            if(key.equals("left")){
                if(Math.abs(answer[0] + x[2]) <= Math.abs(board[0]/2)) answer[0] += x[2];
                if(Math.abs(answer[1] + y[2]) <= Math.abs(board[1]/2)) answer[1] += y[2];
            }
            if(key.equals("down")){
                if(Math.abs(answer[0] + x[3]) <= Math.abs(board[0]/2)) answer[0] += x[3];
                if(Math.abs(answer[1] + y[3]) <= Math.abs(board[1]/2)) answer[1] += y[3];
            }
        }
        return answer;
    }
}