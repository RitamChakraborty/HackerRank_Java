// https://www.hackerrank.com/challenges/java-datatypes/problem

package introduction.java_date_and_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

class Result {
	public static String findDay(int month, int day, int year) {
		LocalDate localDate = LocalDate.of(year, month, day);
		return localDate.getDayOfWeek().toString();
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		
		String res = Result.findDay(month, day, year);
		System.out.println(res);
	}
}
