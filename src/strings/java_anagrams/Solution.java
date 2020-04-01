// https://www.hackerrank.com/challenges/java-anagrams/problem

package strings.java_anagrams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		String string1 = scanner.next();
		String string2 = scanner.next();
		
		System.out.println(isAnagram(string1, string2) ? "Anagrams" : "Not Anagrams");
	}
	
	private static boolean isAnagram(String string1, String string2) {
		char[] chars1 = string1.toLowerCase().toCharArray();
		char[] chars2 = string2.toLowerCase().toCharArray();
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for (char ch : chars1) {
			++count1[(int) ch - 97];
		}
		
		for (char ch : chars2) {
			++count2[(int) ch - 97];
		}
		
		for (int i = 0; i < 26; ++i) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}
		
		return true;
	}
}
