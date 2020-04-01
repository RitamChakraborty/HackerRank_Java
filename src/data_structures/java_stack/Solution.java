// https://www.hackerrank.com/challenges/java-stack/problem

package data_structures.java_stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	private static char getOppositeBracket(char ch) {
		switch (ch) {
			case ')':
				return '(';
			case '}':
				return '{';
			case ']':
				return '[';
			default:
				return '*';
		}
	}
	
	private static boolean isBalanced(String input) {
		char[] chars = input.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for (char ch : chars) {
			if (ch != ')' && ch != '}' && ch != ']') {
				stack.push(ch);
			} else {
				if (!stack.isEmpty()) {
					if (getOppositeBracket(ch) == stack.peek()) {
						stack.pop();
					}
				} else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		while (scanner.hasNext()) {
			System.out.println(isBalanced(scanner.next()));
		}
	}
}
