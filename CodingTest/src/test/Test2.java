package test;

public class Test2 {

	public static void main(String[] args) {
//		// 팩토리얼
//		int fac = 5;
//		int result = 1;
//		
//		for(int i = fac; i > 0; i--) {
//			if(i !=0) {
//			System.out.print(i+"*");
//			}
//			result = result * i;
//		}
//		System.out.println(" = "+result);		
		
		
//		// 피보나치
//		List<Integer> fibonachi = new ArrayList<Integer>();
//		
//		int temp1 = 0;
//		int temp2 = 1;
//		
//		int temp3 = 0;
//		
//		fibonachi.add(temp1);
//		fibonachi.add(temp2);
//		
//		for(int i = 0; i < 8; i++) {
//			temp3 = temp1 + temp2;
//			temp1 = temp2;
//			temp2 = temp3;
//			fibonachi.add(temp3);
//		}
//		System.out.println(fibonachi);
//		System.out.println(fibonachi.get(9));
		
//		System.out.println(fac(fibo(7)));
		System.out.println(fac(20) / (fac(2)*fac(18)));
	}
	
	// 팩토리얼
	public static int fac(int x) {
		if(x == 1) {
			return 1;
		}else {
			return x * fac(x-1);
		}
	}
	
	// 피보나치
	public static int fibo(int y) {
		if(y <= 1) {
			return y;
		}else{
			return fibo(y-2) + fibo(y-1);
		}
	}
}
