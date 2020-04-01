// https://www.hackerrank.com/challenges/tag-content-extractor/problem

package strings.tag_content_extractor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	private static List<String> tagContents(String string) {
		ArrayList<String> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("<([^</>]+)>([^</>]+)</\\1>");
		Matcher matcher = pattern.matcher(string);
		
		while (matcher.find()) {
			list.add(matcher.group(2));
		}
		
		if (list.isEmpty()) {
			list.add("None");
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = Integer.parseInt(scanner.nextLine());
		
		while (n-- > 0) {
			String string = scanner.nextLine();
			tagContents(string).forEach(System.out::println);
		}
	}
}
