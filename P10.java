public class P10 {
	public static void main(String[] args) {
		long sum = 17l;
		for (long i = 9l; i < 2000000l; i+=2l){
			if (isPrime(i)){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	

	}
	
	private static boolean isPrime(long latest) {
		if (latest % 2 == 0){
			return false;
		}
		if (latest % 3 == 0){
			return false;
		}
		if (latest % 5 == 0){
			return false;
		}
		
		for (long i = 7l; i < latest; i++){
			if (latest % i == 0){
				return false;
			}
		}
		return true;
	}

}
