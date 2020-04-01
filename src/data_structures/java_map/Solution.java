// https://www.hackerrank.com/challenges/phone-book/problem

package data_structures.java_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int q = Integer.parseInt(scanner.nextLine());
		Map<String, String> map = new HashMap<>();
		
		for (int i = 0; i < q; ++i) {
			String key = scanner.nextLine();
			String value = scanner.nextLine();
			map.put(key, value);
		}
		
		while (scanner.hasNextLine()) {
			String key = scanner.nextLine();
			System.out.println(
					map.containsKey(key)
							? key + "=" + map.get(key)
							: "Not found"
			);
		}
	}
}
