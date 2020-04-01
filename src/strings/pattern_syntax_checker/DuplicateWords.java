package strings.pattern_syntax_checker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Pattern pattern = Pattern.compile("((\\b\\w+\\b).(((\\b\\2\\b)(.?))+))", Pattern.CASE_INSENSITIVE);
		int t = Integer.parseInt(scanner.nextLine());
		
		while (t-- > 0) {
			String string = scanner.nextLine();
			
			Matcher matcher = pattern.matcher(string);
			
			while (matcher.find()) {
				string = string.replaceAll(
						matcher.group(1),
						matcher.group(2) + matcher.group(6)
				);
			}
			
			System.out.println(string);
		}
	}
}

