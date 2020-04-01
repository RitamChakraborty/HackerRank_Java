// https://www.hackerrank.com/challenges/java-list/problem

package data_structures.java_list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; ++i) {
			list.add(scanner.nextInt());
		}
		
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			String operation = scanner.next();
			
			if (operation.equals("Insert")) {
				int index = scanner.nextInt();
				int num = scanner.nextInt();
				list.add(index, num);
			} else if (operation.equals("Delete")) {
				int index = scanner.nextInt();
				int num = list.remove(index);
			}
		}
		
		CharSequence separator = " ";
		StringJoiner stringJoiner = new StringJoiner(separator);
		list.stream().map(String::valueOf).forEach(stringJoiner::add);
		System.out.println(stringJoiner.toString());
	}
}
