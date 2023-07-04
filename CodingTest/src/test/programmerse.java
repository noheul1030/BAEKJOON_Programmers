package test;

public class programmerse {

	public static void main(String[] args) {
		int[] lottos = new int[] {45,4,35,20,3,9};
		int[] win_nums = new int[] {20,9,3,45,4,35};
		solution(lottos,win_nums);

	}

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
		System.out.println("["+answer[0] + ","+ answer[1]+"]");
		return answer;
	}
}
