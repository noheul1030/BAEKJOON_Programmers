package test;

public class Test7 {
	public static void main(String[] args) {
		System.out.println(calculateCombination(3, 3));

	}

	public static int calculateCombination(int n, int r) {
		if(n < r) return 0;
		
		int answer = 0;

		answer = fac(n) / (fac(r) * fac(n - r));
		return answer;
	}

	public static int fac(int num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return num * fac(num - 1);
	}
}
