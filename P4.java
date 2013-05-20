package Problem;

import java.util.ArrayList;
import java.util.Collections;

public class P4 {
	public static void main(String[] args) {
		ArrayList<Integer> anagrams = new ArrayList<>();
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (itsAnamagram(String.valueOf(i*j))) {
					anagrams.add(i * j);
				}
			}
		}
		Collections.sort(anagrams);
		for (int i = 0; i < anagrams.size(); i++)
		System.out.println(anagrams.get(i));

	}

	private static boolean itsAnamagram(String number) {
		if (number.length() == 0 || number.length() == 1){
			return true;
		}
		if (number.length() == 2){
			return number.charAt(0) == number.charAt(1);
		}
		if (number.charAt(0) != number.charAt(number.length()-1)){
			return false;
		}
		String substring = number.substring(1, number.length()-1);
		return itsAnamagram(substring);
	}

}
