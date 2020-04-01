// https://www.hackerrank.com/challenges/java-negative-subarray/problem

package data_structures.java_subarray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				int sum = 0;
				for (int k = i; k <= j; ++k) {
					sum += arr[k];
				}
				if (sum < 0) {
					++count;
				}
			}
		}
		
		System.out.println(count);
	}
}
