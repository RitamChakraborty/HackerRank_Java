// https://www.hackerrank.com/challenges/java-substring/problem

package strings.java_substring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String string = scanner.nextLine();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		System.out.println(string.substring(start, end));
	}
}
