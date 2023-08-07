package text2;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings,n)));

	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = recursion(strings, n);
        
        return answer;
    }
    public static String[] recursion(String[] strings, int n){
        String[] sorted = {};
        int count = 0;
        for(int i = 0, j = i + 1; i < strings.length-1; i++){
            String tmp = "";
            if(strings[i].charAt(n) > strings[j].charAt(n)){
                tmp = strings[j];
                strings[j] = strings[i];
                strings[i] = tmp;
                count++;                
            }if(strings[i].charAt(n) == strings[j].charAt(n)){
                sorted = new String[]{strings[i],strings[j]};
                Arrays.sort(sorted);
                strings[i] = sorted[0];
                strings[j] = sorted[1];
            }
            j++;
        }
        
        if(count == 0)return strings;
        return recursion(strings, n);
    }

}
