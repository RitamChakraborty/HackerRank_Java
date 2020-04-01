// https://www.hackerrank.com/challenges/valid-username-checker/problem

package strings.valid_username_regular_expression;

import java.util.Scanner;

class UsernameValidator {
	public static String regularExpression;
	
	static {
		regularExpression = "^[a-zA-Z][0-9a-zA-Z_]{7,29}$";
	}
}

public class Solution {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();
			
			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}