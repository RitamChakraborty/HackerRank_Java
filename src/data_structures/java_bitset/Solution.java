// https://www.hackerrank.com/challenges/java-bitset/problem

package data_structures.java_bitset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		
		BitSet bitSet1 = new BitSet(n);
		BitSet bitSet2 = new BitSet(n);
		ArrayList<BitSet> list = new ArrayList<>(Arrays.asList(bitSet1, bitSet2));
		
		while (t-- > 0) {
			String operation = scanner.next();
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			switch (operation) {
				case "AND":
					list.get(i - 1).and(list.get(j - 1));
					break;
				case "OR":
					list.get(i - 1).or(list.get(j - 1));
					break;
				case "XOR":
					list.get(i - 1).xor(list.get(j - 1));
					break;
				case "FLIP":
					list.get(i - 1).flip(j);
					break;
				case "SET":
					list.get(i - 1).set(j);
					break;
			}
			
			System.out.println(list.get(0).cardinality() + " " + list.get(1).cardinality());
		}
	}
}
