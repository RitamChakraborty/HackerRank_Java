// https://www.hackerrank.com/challenges/java-loops/problem

package introduction.java_loops_ii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			
			CharSequence separator = " ";
			StringJoiner stringJoiner = new StringJoiner(separator);
			long sum = 0;
			
			for (int i = 0; i < n; ++i) {
				sum += (int) (Math.pow(2, i) * b);
				stringJoiner.add(String.valueOf(a + sum));
			}
			
			System.out.println(stringJoiner.toString());
		}
	}
}
