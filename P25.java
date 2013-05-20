import java.math.BigDecimal;
import java.util.HashMap;

public class P25 {
	static HashMap <BigDecimal, BigDecimal> map = new HashMap<>();

	public static void main(String[] args) {
		BigDecimal i = new BigDecimal(1);
		while (true){
			String number = String.valueOf(fibonacci(i));
			if (number.length() > 1000){
				System.out.println(i);
				return;
			}
			i = i.add(new BigDecimal(1));
		}
		

	}
	
	public static BigDecimal fibonacci (BigDecimal n){
		BigDecimal f = new BigDecimal(0);
		if (map.containsKey(n)){
			return map.get(n);
		}
		if (n.equals(new BigDecimal(1)) || n.equals(new BigDecimal(0))){
			return new BigDecimal(1);
		}
		
		f = fibonacci(n.subtract(new BigDecimal(1))).add(fibonacci(n.subtract(new BigDecimal(2))));
		
		System.out.println(n);
		map.put(n, f);
		
		
		return f;
	}

}



