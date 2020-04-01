// https://www.hackerrank.com/challenges/java-dequeue/problem

package data_structures.java_dequeue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int distCount = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < k; i++) {
			if (hashMap.get(arr[i]) == null) {
				hashMap.put(arr[i], 1);
				distCount++;
			} else {
				int count = hashMap.get(arr[i]);
				hashMap.put(arr[i], count + 1);
			}
		}
		
		max = Integer.max(max, distCount);
		
		for (int i = k; i < arr.length; i++) {
			if (hashMap.get(arr[i - k]) == 1) {
				hashMap.remove(arr[i - k]);
				distCount--;
			} else {
				int count = hashMap.get(arr[i - k]);
				hashMap.put(arr[i - k], count - 1);
			}
			
			if (hashMap.get(arr[i]) == null) {
				hashMap.put(arr[i], 1);
				distCount++;
			} else {
				int count = hashMap.get(arr[i]);
				hashMap.put(arr[i], count + 1);
			}
			
			max = Integer.max(max, distCount);
		}
		
		System.out.println(max);
	}
}