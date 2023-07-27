package test;

public class DFSTEST {

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
        Test(arr);
    }

    public static void Test(int[][] arr) {
        boolean[][] bool = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 && bool[i][j] == false) {

                }
            }
        }
    }

    public static void DFS() {

    }

}
