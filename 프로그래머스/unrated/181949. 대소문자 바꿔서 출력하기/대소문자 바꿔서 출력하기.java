import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        for(Character str : a.toCharArray()){
            if(Character.isUpperCase(str)){
                result += Character.toLowerCase(str);
            }else if(Character.isLowerCase(str)){
                result += Character.toUpperCase(str);
            }
        }
        System.out.println(result);
    }
}