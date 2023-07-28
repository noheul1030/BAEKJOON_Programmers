import java.util.*;
class Solution {
    public static int solution(int[] arr) {
        int answer = Retry(arr, 0);
        return answer;
    }

    public static int Retry(int[] arr, int cnt) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] >= 50) arr2[i] = arr[i] / 2;
            } else {
                if (arr[i] < 50) arr2[i] = arr[i] * 2 + 1;
            }
        }

        if (!Arrays.equals(arr, arr2)) {
            cnt++;
            return Retry(arr2, cnt);
        } else
            return cnt - 1;
    }
}