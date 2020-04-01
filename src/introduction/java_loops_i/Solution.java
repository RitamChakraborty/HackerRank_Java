// https://www.hackerrank.com/challenges/java-loops-i/problem

package introduction.java_loops_i;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < 10; ++i) {
			System.out.printf("%d x %d = %d\n", n, (i + 1), n * (i + 1));
		}
	}
}
