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
        solution(genres, plays);
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();

        int result = 0;

        // 장르 당 갯수 찾기 map
        for (String g : genres) {
            map.put(g, map.getOrDefault(g, 0) + 1);
        }
        // answer에 대한 배열 길이 값 구하는 반복문
        for (String m : map.keySet()) {
            if (map.get(m) >= 2)
                result += 2;
            if (map.get(m) == 1)
                result++;
        }

        // 배열 초기화
        int[] answer = new int[result];

        // 최대 재생수,최대 인덱스, 최대 장르
        int maxValue = 0;
        int maxIndex = 0;
        String maxGenres = "";

        // 배열 copy
        List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
        List<Integer> selectList = new ArrayList<>();

        // answer 배열 길이 반복문
        for (int i = 0; i < answer.length; i++) {
            // 최대 재생,인덱스,장르 찾는 반복문
            Collections.sort(playList);
            Collections.reverse(playList);
            maxValue = playList.get(0);
            maxIndex = indexCheck(plays, maxValue);
            maxGenres = genres[maxIndex];

            // 최대 장르와 같은 index 번호들 저장 반복문
            for (int j2 = 0; j2 < plays.length; j2++) {
                if (genres[j2].equals(maxGenres)) {
                    selectList.add(j2);
                    playList.set(j2, 0);
                }
            }
            // 리스트 정렬 -> 뒤집기
            Collections.sort(selectList);
            Collections.reverse(selectList);

            // 최대 장르에서 2개 index만 뽑아와서 저장 반복문
            for (int j3 = 0; j3 < 2; j3++) {
                int n = indexCheck(plays, selectList.get(j3));
                if (map.get(maxGenres) == 1) {
                    answer[i] = n;
                    break;
                } else {
                    answer[i] = n;
                }
            }
            // 리스트 초기화(다음 최대 장르 찾기위한)
            selectList.clear();
            // 최대 재생수 초기화
            maxValue = 0;
        }
        return answer;
    }

    public static int indexCheck(int[] plays, int value) {
        for (int i = 0; i < plays.length; i++) {
            if (plays[i] == value) {
                return i;
            }
        }
        return 0;
    }
}