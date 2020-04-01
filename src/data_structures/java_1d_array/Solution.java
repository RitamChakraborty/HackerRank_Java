// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

package data_structures.java_1d_array;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; ++i) {
			int m = scan.nextInt();
			a[i] = m;
		}
		
		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
