public class P5 {
	public static void main(String[] args) {
		int n = 1;
		boolean finish = false;
		while (!finish){
			for (int i = 1; i < 21; i++){
				if (n % i != 0){
					break;
				}
				if (i == 20){
					System.out.println(n);
					finish = true;
				}
			}
			n++;
		}
	}
}
