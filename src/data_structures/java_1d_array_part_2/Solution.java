// https://www.hackerrank.com/challenges/java-1d-array/problem

package data_structures.java_1d_array_part_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	private static boolean canWin(int leap, int[] arr, int i) {
		if (i < 0 || arr[i] != 0) {
			return false;
		} else if (i + leap >= arr.length || i == arr.length - 1) {
			return true;
		} else {
			arr[i] = 1;
			return canWin(leap, arr, i + leap) || canWin(leap, arr, i + 1) || canWin(leap, arr, i - 1);
		}
	}
	
	private static boolean canWin(int leap, int[] arr) {
		return canWin(leap, arr, 0);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int n = scanner.nextInt();
			int leap = scanner.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; ++i) {
				arr[i] = scanner.nextInt();
			}
			
			System.out.println(canWin(leap, arr) ? "YES" : "NO");
		}
	}
}

