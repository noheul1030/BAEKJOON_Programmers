package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String[] genres = { "classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 600, 150, 800, 2500 };
        System.out.println(Arrays.toString(solution2(genres, plays)));
    }
    
    public static int[] solution2(String[] genres, int[] plays) {
    	int result = 0;
    	
    	HashMap<String,List<Integer>> map = new HashMap<>();
    	
    	for (String g : genres) {
            map.put(g, null);
        }
    	
    	for(String g2 : map.keySet()) {
    		List<Integer> list = new ArrayList<>();
    		for(int i = 0; i < plays.length; i++) {
    			if(genres[i].equals(g2)) {
    				list.add(plays[i]);
    			}
    		}
    		Collections.sort(list);
    		Collections.reverse(list);
    		
    		map.put(g2, list);
    		
    		List<Integer> resultCnt = map.get(g2);
    		
    		result += Math.min(resultCnt.size(), 2);
    	}
    	
    	
    	int[] answer = new int[result];
    	
    	// 최대 재생수,최대 인덱스, 최대 장르
        int maxValue = 0;
        int maxIndex = 0;
        String maxGenres = "";
        
        int answerCnt = 0;
        // answer 배열 길이 반복문
        for (int i = 0; i < answer.length; i++) {
        	if(answerCnt == result) break;
        	
        	HashMap<Integer,Integer> map2 = new HashMap<>();
        	
        	for (String p : Arrays.toString(plays)) {
                map.put(p, null);
            }
        	for(int j = 0; j < plays.length; j++) {
        		 
        	}
        	// 배열 copy
        	List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
            
        	// 최대 재생,인덱스,장르 찾는 반복문
            Collections.sort(playList);
            Collections.reverse(playList);
            maxValue = playList.get(0);
            maxIndex = indexCheck(plays, maxValue);
            maxGenres = genres[maxIndex];
            
            List<Integer> valueList = map.get(maxGenres);
            
            for(int j = 0; j < valueList.size(); j++) {
            	if(j == 2) break;            	
   
            	for(int j2 = 0; j2 < plays.length; j2++) {
            		if(valueList.size() == 1) {
            			if(valueList.get(j) == plays[j2]) {
            				answer[answerCnt] = j2;
            				answerCnt++;
                		}
            			break;
            		}else {
            			if(valueList.get(j) == plays[j2]) {
            				answer[answerCnt] = j2;
            				answerCnt++;         			
                		}
            		}            		
            	}
            }
            
            for(int j3 = 0; j3 < playList.size(); j3++) {
            	if(genres[j3].equals(maxGenres)) {
            		plays[j3]= 0;
            	}
            }
            
        }
    	
    	
    	return answer;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static int[] solution(String[] genres, int[] plays) {
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        int result = 0;
//
//        // 장르 당 갯수 찾기 map
//        for (String g : genres) {
//            map.put(g, map.getOrDefault(g, 0) + 1);
//        }
//        // answer에 대한 배열 길이 값 구하는 반복문
//        for (String m : map.keySet()) {
//        	result += Math.min(map.get(m), 2);
//        }
//
//        // 배열 초기화
//        int[] answer = new int[result];
//
//        // 최대 재생수,최대 인덱스, 최대 장르
//        int maxValue = 0;
//        int maxIndex = 0;
//        String maxGenres = "";
//
//
//        int answerCnt = 0;
//        // answer 배열 길이 반복문
//        for (int i = 0; i < answer.length; i++) {
//        	if(answerCnt == result) break;
//        	
//        	// 배열 copy
//        	List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
//        	List<Integer> selectList = new ArrayList<>();
//            
//        	// 최대 재생,인덱스,장르 찾는 반복문
//            Collections.sort(playList);
//            Collections.reverse(playList);
//            maxValue = playList.get(0);
//            maxIndex = indexCheck(plays, maxValue);
//            maxGenres = genres[maxIndex];
//
//            
//            // 최대 장르와 같은 index 번호들 저장 반복문
//            for (int j2 = 0; j2 < plays.length; j2++) {
//                if (genres[j2].equals(maxGenres)) {
//                    selectList.add(plays[j2]);
//                    plays[j2] = 0;
//                }
//            }
//            // 리스트 정렬 -> 뒤집기
//            Collections.sort(selectList);
//            Collections.reverse(selectList);
//            
//            //List<Integer> asd = Arrays.asList(toIntegerArrays(answer));
//            
//            for(int j3 = 0; j3 < selectList.size(); j3++) {
//            	
//            	selectList.set(j3, Arrays.asList(plays).indexOf(selectList.get(j3)));
//            }
//
//            // 최대 장르에서 2개 index만 뽑아와서 저장 반복문
//            for (int j3 = 0; j3 < 2; j3++) {
//                if (map.get(maxGenres) == 1) {
//                    answer[answerCnt] = selectList.get(j3);
//                    answerCnt++;
//                    break;
//                } else {
//                    answer[answerCnt] = selectList.get(j3);
//                    answerCnt++;
//                }
//            }
//            
//            // 최대 재생수 초기화
//            maxValue = 0;
//        }
//        return answer;
//    }
//
    public static int indexCheck(int[] plays, int value) {
        for (int i = 0; i < plays.length; i++) {
            if (plays[i] == value) {
                return i;
            }
        }
        return 0;
    }
}