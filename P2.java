public class P2 {
	private int solution;
	
	public int solveProblem (){
		int n = 0;
		int latestValue = fibonacci(n);
		while (latestValue < 4000000){	
			if (latestValue % 2 == 0){
				this.solution += latestValue;
			}
			n++;
			latestValue = fibonacci(n);
		}
				

		return this.solution;
	}
	
	public int fibonacci (int n){
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
