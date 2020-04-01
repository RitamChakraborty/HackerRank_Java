// https://www.hackerrank.com/challenges/java-datatypes/problem

package introduction.java_datatypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			String string = scanner.next();
			
			try {
				long aLong = Long.parseLong(string);
				System.out.println(aLong + " can be fitted in:");
				
				if (aLong >= (long) Byte.MIN_VALUE && aLong <= (long) Byte.MAX_VALUE) {
					System.out.println("* byte");
				}
				if (aLong >= (long) Short.MIN_VALUE && aLong <= (long) Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if (aLong >= (long) Integer.MIN_VALUE && aLong <= (long) Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				System.out.println("* long");
			} catch (Exception e) {
				System.out.println(string + " can't be fitted anywhere.");
			}
		}
	}
}
