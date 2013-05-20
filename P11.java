import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11 {
	static int [][] matrix = new int [20][20];

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("C:/Users/Daniel/Desktop/P11.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(fr);
		int row = 0, column = 0;
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			
			while (st.hasMoreElements()){
				matrix[row][column] = Integer.valueOf(st.nextToken());
				column++;
			}
			column = 0;
			row++;
		}
		scanner.close();
		
		int mayor = 0;
		int indexi = 0;
		int indexj = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[1].length; j++){
				try{
					if (mayor < (matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3])){
						indexi = i;
						indexj = j;
						mayor = (matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3]);
					}
				}
				catch (IndexOutOfBoundsException e){
					
				}
			}
		}
		
		
		mayor = 0;
		indexi = 0;
		indexj = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[1].length; j++){
				try{
					if (mayor < (matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j])){
						indexi = i;
						indexj = j;
						mayor = (matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j]);
					}
				}
				catch (IndexOutOfBoundsException e){
					
				}
			}
		}
		
		mayor = 0;
		indexi = 0;
		indexj = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[1].length; j++){
				try{
					if (mayor < (matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3])){
						indexi = i;
						indexj = j;
						mayor = (matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3]);
					}
				}
				catch (IndexOutOfBoundsException e){
					
				}
			}
		}
		
		
		mayor = 0;
		indexi = 0;
		indexj = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[1].length; j++){
				try{
					if (mayor < (matrix[i][j]*matrix[i+1][j-1]*matrix[i+2][j-2]*matrix[i+3][j-3])){
						indexi = i;
						indexj = j;
						mayor = (matrix[i][j]*matrix[i+1][j-1]*matrix[i+2][j-2]*matrix[i+3][j-3]);
					}
				}
				catch (IndexOutOfBoundsException e){
					
				}
			}
		}
	}
}
