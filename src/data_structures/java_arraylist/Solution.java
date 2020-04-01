// https://www.hackerrank.com/challenges/java-arraylist/problem

package data_structures.java_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		ArrayList<int[]> list = new ArrayList<>(n);
		
		for (int i = 0; i < n; ++i) {
			int t = scanner.nextInt();
			int[] arr = new int[t];
			
			for (int j = 0; j < t; ++j) {
				arr[j] = scanner.nextInt();
			}
			
			list.add(arr);
		}
		
		int q = scanner.nextInt();
		
		while (q-- > 0) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			try {
				System.out.println(list.get(i - 1)[j - 1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}
}
