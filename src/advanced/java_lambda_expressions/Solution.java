// https://www.hackerrank.com/challenges/java-lambda-expressions/problem

package advanced.java_lambda_expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public PerformOperation isOdd() {
		return a -> a % 2 != 0;
	}
	
	public PerformOperation isPrime() {
		return a -> {
			if (a < 2) {
				return false;
			} else if (a == 2) {
				return true;
			}
			
			for (int i = 2; i <= (int) Math.sqrt(a); ++i) {
				if (a % i == 0) {
					return false;
				}
			}
			
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return a -> new StringBuffer(String.valueOf(a)).reverse().toString().equals(String.valueOf(a));
	}
	
}

public class Solution {
	
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
				
			}
			System.out.println(ans);
		}
	}
}

