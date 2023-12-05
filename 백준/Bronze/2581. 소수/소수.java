import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> primes = new ArrayList<>();
		
		for(int i = n; i <= m; i++) {
			if (isPrime(i)) {
                primes.add(i);
            }
		}
		
		if (!primes.isEmpty()) {
            int sum = primes.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);
            System.out.println(primes.get(0));
        } else {
            System.out.println(-1);
        }
	}
	
	private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}