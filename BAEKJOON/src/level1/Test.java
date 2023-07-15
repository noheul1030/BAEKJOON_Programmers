package level1;
import java.util.*;

public class Test {
	public static void main(String[] args) {
//		String my_str = "adshjklahjkadshfjlkadsfhjklasdhfjkl";
//		System.out.println(solution2(my_str,3));
		
//		System.out.println(solution3());
		
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		System.out.println(solution4(spell, dic));
	}
	
	
	public static String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[len % n == 0 ? len / n : len / n + 1];
        
        int cnt = 0;
        while(my_str.length() > n){
        	String str = my_str.substring(0,n);
        	
            answer[cnt] = str;
            my_str = my_str.replace(str,"");
            cnt++;
        }
        if(!(my_str.isEmpty())) answer[cnt] = my_str.substring(0);
        return answer;
    }
	
	public static List<String> solution2(String my_str, int n) {
        List<String> list = new ArrayList<>();
        while(my_str.length() > n){
            list.add(my_str.substring(0,n));
            my_str = my_str.substring(n,my_str.length());
        }
        if(!(my_str.isEmpty())) {
        	list.add(my_str.substring(0));
        }
        return list;
    }
	
	public static int solution3() {
		String my_string = "3 + 4";
		my_string = my_string.replaceAll(" ", "");
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(String str : my_string.split("")){
        	System.out.println(str);
            list.add(str);
        }
        return answer;
    }
	
	public static int solution4(String[] spell, String[] dic) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        for(String d : dic){
            for(String d2 : d.split("")){
                 map.put(d2,1);
            }    
            for(String s : spell){
                map.put(s,map.getOrDefault(s,0) + 1);
            }
            System.out.println("map에 담긴 값 : " + map);
            System.out.println();
            
//// 이 부분 수정 필요            
            for(String m : map.keySet()){
                if(map.get(m) == 2){
                    count += map.get(m);
                }else break;
            }
            list.add(spell.length*2 != count ? 2 : 1);
/////            
            
            map.clear();
        }
        
        System.out.println("list에 담긴 값 : " + list);
        System.out.println();
        for(int n : list){
            if(n == 1){
                answer = n; 
                break;
            }
            else answer = n;
        }
        return answer;
    }
}
