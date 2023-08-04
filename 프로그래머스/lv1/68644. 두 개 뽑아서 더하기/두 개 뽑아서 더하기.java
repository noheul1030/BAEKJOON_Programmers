import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        Iterator<Integer> iter = set.iterator();
        List<Integer> list = new ArrayList<>();
        while(iter.hasNext()){
            list.add(iter.next());
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}