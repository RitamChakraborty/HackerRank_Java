// https://www.hackerrank.com/challenges/java-stdin-stdout/problem

package introduction.java_stdin_and_stdout_ii;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String intString = scanner.next();
		String doubleString = scanner.next();
		String string = scanner.nextLine();
		
		System.out.println("String: " + string);
		System.out.println("Double: " + Double.parseDouble(doubleString));
		System.out.println("Int: " + intString);
	}
}
