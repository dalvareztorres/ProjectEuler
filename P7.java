import java.util.ArrayList;

public class P7 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<>();
		int n = 2;
		while (primes.size() < 10001){
			if (isPrime(n)){
				primes.add(n);
			}
			n++;
		}
		for (int i = 0; i < primes.size(); i++){
			System.out.println(primes.get(i));
		}

	}

	private static boolean isPrime(long latest) {
		for (int i = 2; i < latest; i++) {
			if (latest % i == 0) {
				return false;
			}
		}
		return true;
	}

}
