package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programmerse {

	public static void main(String[] args) {
		int[] lottos = new int[] { 45, 4, 35, 20, 3, 9 };
		int[] win_nums = new int[] { 20, 9, 3, 45, 4, 35 };
		// solution(lottos, win_nums);

		int rows = 100;
		int columns = 97;
		//int[][] queries = new int[][] { { 2,2,5,4 }, { 3,3,6,6 }, { 5,1,6,3 }};
		//int[][] queries = new int[][] { { 1,1,2,2 }, { 1,2,2,3 }, { 2,1,3,2 }, { 2,2,3,3 } };
		int[][] queries = new int[][] {{ 1,1,100,97 }};
		//solution(rows, columns, queries);
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		solution(array,commands);

	}

	
	// 로또의 최고 순위와 최저 순위
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int count = 0;
		int zero = 0;
		for (int lotto : lottos) {
			for (int nums : win_nums) {
				if (nums == lotto) {
					count++;
				}
			}
			if (lotto == 0) {
				zero++;
			}
		}
		switch (count + zero) {
		case 6:
			answer[0] = 1;
			break;
		case 5:
			answer[0] = 2;
			break;
		case 4:
			answer[0] = 3;
			break;
		case 3:
			answer[0] = 4;
			break;
		case 2:
			answer[0] = 5;
			break;
		case 1:
			answer[0] = 6;
			break;
		default:
			answer[0] = 6;
			break;
		}

		switch (count) {
		case 6:
			answer[1] = 1;
			break;
		case 5:
			answer[1] = 2;
			break;
		case 4:
			answer[1] = 3;
			break;
		case 3:
			answer[1] = 4;
			break;
		case 2:
			answer[1] = 5;
			break;
		case 1:
			answer[1] = 6;
			break;
		default:
			answer[1] = 6;
			break;
		}
		System.out.println("[" + answer[0] + "," + answer[1] + "]");
		return answer;
	}

	
	// 행렬 테두리 회전하기
	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] list = new int[rows][columns];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 1; i <= rows * columns; i++) {
			if (count1 < columns) {
				list[count2][count1] = i;
				count1++;
			} else {
				count1 = 0;
				count2++;

				list[count2][count1] = i;
				count1++;
			}
		}

		int temp1 = 0;
		int temp2 = 0;
		
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		boolean bool = true;
		
		for (int[] numlist : queries) {
			bool = true;
			List<Integer> check = new ArrayList<Integer>();

			int x0 = numlist[0]-1, y0 = numlist[1]-1;
			int x1 = x0, y1 = y0;
			int x2 = numlist[2]-1, y2 = numlist[3]-1, d = 1;

			while (bool == true) {

				int nx = x1 + dx[d];
				int ny = y1 + dy[d];

				if (nx > x2 || ny > y2 || nx < x0 || ny < y0) {
					d = (d + 1) % 4;
					continue;
				} else {
					temp2 = list[x1][y1];
					check.add(temp2);
					list[x1][y1] = temp1;
					temp1 = temp2;
					
					if (x0 == nx && y0 == ny) {
						list[x0][y0] = temp1;
						Collections.sort(check);
						answer[count3] = check.get(0);
						count3++;
						bool = false;
					}					
				}
				x1 = nx;
				y1 = ny;
			}
		}
		for(int a : answer) {
			System.out.print(a+" ");
		}
		return answer;
	}
	
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int count1 = 0;
        int count2 = 0;
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];            
            
            int[] result = new int[j-i+1];
            
            for(int a = i; a <= j; a++){
            	result[count1] = array[a-1];
                count1++;
            }
            Arrays.sort(result);
            answer[count2] = result[k-1];
            count1 = 0;
            count2++;
        }        
        return answer;
    }

}