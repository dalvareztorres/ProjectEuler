public class P3 {
	private long solution;
	
	public long solveProblem (){
		long a = 600851475143L; 
		long latest = 0;
		for (long i = 1; i < a; i+=2){
			if (a % i == 0){
				latest = i;
				if (isPrime(latest)){
					System.out.println("Factor prime: "+latest);
					this.solution = latest;
				}
			}
		}
		return this.solution;
	}

	private boolean isPrime(long latest) {
		for (int i = 3; i < latest; i++){
			if (latest % i == 0){
				return false;
			}
		}
		return true;
	}
}
