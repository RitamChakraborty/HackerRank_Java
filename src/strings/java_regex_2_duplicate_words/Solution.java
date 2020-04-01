// https://www.hackerrank.com/challenges/duplicate-word/problem

package strings.java_regex_2_duplicate_words;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while (t-- > 0) {
			String[] strings = scanner.nextLine().split(" ");
			Set<String> set = new LinkedHashSet<>(Arrays.asList(strings));
			CharSequence separator = " ";
			StringJoiner stringJoiner = new StringJoiner(separator);
			set.forEach(stringJoiner::add);
			System.out.println(stringJoiner.toString());
		}
	}
}
