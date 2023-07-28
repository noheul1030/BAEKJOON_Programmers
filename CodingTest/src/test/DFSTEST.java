package test;

public class DFSTEST {

	static int[][] arr = { { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
	static int iceCount = 1;
	
    public static void main(String[] args) {
        Test(arr);
    }

    public static void Test(int[][] arr) {
        boolean[][] bool = new boolean[arr.length][arr[0].length];
        
        int ice = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 && bool[i][j] == false) {
                	ice++;
                	bool[i][j] = true;
                	DFS(i,j,bool);
                	System.out.println("얼음의 크기 : " + iceCount);
                }
                iceCount = 1;
            }
        }
        System.out.println("\n얼음의 갯수 : " + ice);
    }

    public static void DFS(int num1 , int num2, boolean[][] bool) {
    	int[] dx = {0,1,0,-1};
    	int[] dy = {1,0,-1,0};
    	int nx = 0, ny = 0;    	
    	
    	for(int i = 0; i < 4; i++) {
    		nx = num1 + dx[i];
    		ny = num2 + dy[i];
    		if( nx < arr.length && nx >= 0 && ny < arr[0].length && ny >= 0 
    				&& bool[nx][ny] == false && arr[nx][ny] == 0) {
    			iceCount++;
    			bool[nx][ny] = true;
    			DFS(nx,ny,bool);
    		}
    	}
    }

}
