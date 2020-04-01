package strings.java_string_introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String string1 = scanner.next();
		String string2 = scanner.next();
		
		int length = string1.length() + string2.length();
		int compare = string1.compareTo(string2);
		String combinedString = Character.toUpperCase(string1.charAt(0)) + string1.substring(1) + " "
				                        + Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
		
		System.out.println(length);
		System.out.println(compare > 0 ? "Yes" : "No");
		System.out.println(combinedString);
	}
}

