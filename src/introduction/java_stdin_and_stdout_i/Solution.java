// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

package introduction.java_stdin_and_stdout_i;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		while (scanner.hasNext()) {
			String input = scanner.next();
			System.out.println(input);
		}
	}
}
