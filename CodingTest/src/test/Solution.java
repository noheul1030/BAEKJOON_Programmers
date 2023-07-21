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
    	
    	// �ִ� �����,�ִ� �ε���, �ִ� �帣
        int maxValue = 0;
        int maxIndex = 0;
        String maxGenres = "";
        
        int answerCnt = 0;
        // answer �迭 ���� �ݺ���
        for (int i = 0; i < answer.length; i++) {
        	if(answerCnt == result) break;
        	
        	HashMap<Integer,Integer> map2 = new HashMap<>();
        	
        	for (String p : Arrays.toString(plays)) {
                map.put(p, null);
            }
        	for(int j = 0; j < plays.length; j++) {
        		 
        	}
        	// �迭 copy
        	List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
            
        	// �ִ� ���,�ε���,�帣 ã�� �ݺ���
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
//        // �帣 �� ���� ã�� map
//        for (String g : genres) {
//            map.put(g, map.getOrDefault(g, 0) + 1);
//        }
//        // answer�� ���� �迭 ���� �� ���ϴ� �ݺ���
//        for (String m : map.keySet()) {
//        	result += Math.min(map.get(m), 2);
//        }
//
//        // �迭 �ʱ�ȭ
//        int[] answer = new int[result];
//
//        // �ִ� �����,�ִ� �ε���, �ִ� �帣
//        int maxValue = 0;
//        int maxIndex = 0;
//        String maxGenres = "";
//
//
//        int answerCnt = 0;
//        // answer �迭 ���� �ݺ���
//        for (int i = 0; i < answer.length; i++) {
//        	if(answerCnt == result) break;
//        	
//        	// �迭 copy
//        	List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
//        	List<Integer> selectList = new ArrayList<>();
//            
//        	// �ִ� ���,�ε���,�帣 ã�� �ݺ���
//            Collections.sort(playList);
//            Collections.reverse(playList);
//            maxValue = playList.get(0);
//            maxIndex = indexCheck(plays, maxValue);
//            maxGenres = genres[maxIndex];
//
//            
//            // �ִ� �帣�� ���� index ��ȣ�� ���� �ݺ���
//            for (int j2 = 0; j2 < plays.length; j2++) {
//                if (genres[j2].equals(maxGenres)) {
//                    selectList.add(plays[j2]);
//                    plays[j2] = 0;
//                }
//            }
//            // ����Ʈ ���� -> ������
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
//            // �ִ� �帣���� 2�� index�� �̾ƿͼ� ���� �ݺ���
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
//            // �ִ� ����� �ʱ�ȭ
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