import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("C:/Users/Daniel/Desktop/P13.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BigDecimal sum = new BigDecimal(0);
		Scanner scanner = new Scanner(fr);
		while (scanner.hasNextBigDecimal()){
			sum = sum.add(scanner.nextBigDecimal());
		}
		scanner.close();
		System.out.println(sum.toString());
		
		
		

	}

}
