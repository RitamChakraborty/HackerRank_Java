// https://www.hackerrank.com/challenges/java-regex/problem

package strings.java_regex;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		
	}
}

class MyRegex {
	public String pattern;
	
	public MyRegex() {
		pattern = "^([0-9]|([0-9]){2}|[0-1]([0-9]){2}|2[0-4][0-9]|25([0-5]))\\.([0-9]|([0-9]){2}|[0-1]([0-9]){2}|2[0-4][0-9]|25([0-5]))\\.([0-9]|([0-9]){2}|[0-1]([0-9]){2}|2[0-4][0-9]|25([0-5]))\\.([0-9]|([0-9]){2}|[0-1]([0-9]){2}|2[0-4][0-9]|25([0-5]))$";
	}
}