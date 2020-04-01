package strings.java_substring_comparision;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	private static String getSmallestAndLargest(String input, int t) {
		String smallest;
		String largest;
		
		int n = input.length();
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i + t <= n; ++i) {
			list.add(input.substring(i, i + t));
		}
		
		list.sort(String::compareTo);
		
		smallest = list.get(0);
		largest = list.get(list.size() - 1);
		
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String input = scanner.next();
		int t = scanner.nextInt();
		
		System.out.println(getSmallestAndLargest(input, t));
	}
}
