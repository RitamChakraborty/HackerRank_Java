// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

package exception_handling.java_exception_handling_try_catch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			try {
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			}
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
	}
}
