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

        // �帣 �� ���� ã�� map
        for (String g : genres) {
            map.put(g, map.getOrDefault(g, 0) + 1);
        }
        // answer�� ���� �迭 ���� �� ���ϴ� �ݺ���
        for (String m : map.keySet()) {
            if (map.get(m) >= 2)
                result += 2;
            if (map.get(m) == 1)
                result++;
        }

        // �迭 �ʱ�ȭ
        int[] answer = new int[result];

        // �ִ� �����,�ִ� �ε���, �ִ� �帣
        int maxValue = 0;
        int maxIndex = 0;
        String maxGenres = "";

        // �迭 copy
        List<Integer> playList = Arrays.stream(plays).boxed().collect(Collectors.toList());
        List<Integer> selectList = new ArrayList<>();

        // answer �迭 ���� �ݺ���
        for (int i = 0; i < answer.length; i++) {
            // �ִ� ���,�ε���,�帣 ã�� �ݺ���
            Collections.sort(playList);
            Collections.reverse(playList);
            maxValue = playList.get(0);
            maxIndex = indexCheck(plays, maxValue);
            maxGenres = genres[maxIndex];

            // �ִ� �帣�� ���� index ��ȣ�� ���� �ݺ���
            for (int j2 = 0; j2 < plays.length; j2++) {
                if (genres[j2].equals(maxGenres)) {
                    selectList.add(j2);
                    playList.set(j2, 0);
                }
            }
            // ����Ʈ ���� -> ������
            Collections.sort(selectList);
            Collections.reverse(selectList);

            // �ִ� �帣���� 2�� index�� �̾ƿͼ� ���� �ݺ���
            for (int j3 = 0; j3 < 2; j3++) {
                int n = indexCheck(plays, selectList.get(j3));
                if (map.get(maxGenres) == 1) {
                    answer[i] = n;
                    break;
                } else {
                    answer[i] = n;
                }
            }
            // ����Ʈ �ʱ�ȭ(���� �ִ� �帣 ã������)
            selectList.clear();
            // �ִ� ����� �ʱ�ȭ
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