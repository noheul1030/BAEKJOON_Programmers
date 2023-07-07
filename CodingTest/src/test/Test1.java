package test;

public class Test1 {

	public static void main(String[] args) {
		test1();
		test2();
		
		
	}
	
	public static void test1() {
		String[] str = {"빨","주","노","파","남","보",""};
		String strA = "";
		String strB = "";
		for(int i= 3; i < 7;i++){
			if(i == 3){
				strA = str[i];
				str[i] = "초";
			}else{
				strB = str[i];
				str[i] = strA;
				strA = strB;
			}
		}
		for(String STR : str) {
			System.out.print(STR+" ");
		}
		System.out.println();
	}
	
	public static void test2() {
		int[] A = {5,6,8,9,10,0};
		int a = 0;
		int b = 0;
		for(int i= 2; i < 6;i++){
			if(i == 2){
				a = A[i];
				A[i] = 7;
			}else{
				b = A[i];
				A[i] = a;
				a = b;
			}
		}
		for(int AA : A) {
			System.out.print(AA+" ");
		}		
		System.out.println();
	}
}
