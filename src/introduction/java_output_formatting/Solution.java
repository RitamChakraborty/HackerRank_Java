// https://www.hackerrank.com/challenges/java-output-formatting/problem

package introduction.java_output_formatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		System.out.println("================================");
		
		while (scanner.hasNext()) {
			String aString = scanner.next();
			int aInt = scanner.nextInt();
			
			System.out.printf("%-15s%03d\n", aString, aInt);
		}
		
		System.out.println("================================");
	}
}
