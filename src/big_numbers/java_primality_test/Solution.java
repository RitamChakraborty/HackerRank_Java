package big_numbers.java_primality_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String n = scanner.next();
		
		System.out.println(
				new BigInteger(n).isProbablePrime(1)
						? "Prime"
						: "Not Prime"
		);
	}
}
