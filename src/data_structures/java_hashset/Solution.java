// https://www.hackerrank.com/challenges/java-hashset/problem

package data_structures.java_hashset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int t = Integer.parseInt(scanner.nextLine());
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		
		for (int i = 0; i < t; i++) {
			String input = scanner.nextLine();
			pair_left[i] = input.split(" ")[0];
			pair_right[i] = input.split(" ")[1];
		}
		
		// Solution
		HashSet<String> hashSet = new HashSet<>();
		for (int i = 0; i < t; i++) {
			hashSet.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(hashSet.size());
		}
	}
}
