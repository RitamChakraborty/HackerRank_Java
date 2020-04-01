// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

package introduction.java_static_initializer_block;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	
	private static Scanner scanner;
	private static int B;
	private static int H;
	private static boolean flag;
	
	static {
		scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		B = scanner.nextInt();
		H = scanner.nextInt();
		flag = true;
		
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
		
	}
}
