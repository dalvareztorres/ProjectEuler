public class P9 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (c = 0; c<9999999;c++){
			for (b = 0; b < c; b++){
				for (a = 0; a < b; a++){
					int aSquare = a*a;
					int bSquare = b*b;
					int cSquare = c*c;
					if (aSquare+bSquare == cSquare){
						if (a+b+c == 1000){
							System.out.println(a*b*c);
							return;
						}
					}
				}
			}
		}
	}
}
