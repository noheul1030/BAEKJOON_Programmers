import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.next();

        HashMap<String,Integer> map = new HashMap<>();
		
		for(String key : input.split("")) {
			key = key.toUpperCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		
		String value = "";
		int count = 0;
		
		String maxIndex = "";
		int max = 0;

		for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > max) {
                maxIndex = entry.getKey();
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                System.out.println("?");
                return;
            }
        }
		System.out.println(maxIndex);
    }	
}