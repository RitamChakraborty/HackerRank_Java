package strings.java_string_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String string = new Scanner(new BufferedReader(new InputStreamReader(System.in))).next();
		
		System.out.println(
				string.equals(new StringBuffer(string).reverse().toString())
						? "Yes"
						: "No"
		);
	}
}
