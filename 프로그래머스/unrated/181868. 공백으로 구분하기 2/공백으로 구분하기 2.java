import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        String[] answer = Arrays.stream(str).filter(i -> !i.isEmpty()).toArray(String[]::new);
        return answer;
    }
}