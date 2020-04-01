// https://www.hackerrank.com/challenges/java-string-tokens/problem

package strings.java_string_tokens;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String string = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(string, " !,?._'@");
		int count = stringTokenizer.countTokens();
		
		System.out.println(count);
		
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
