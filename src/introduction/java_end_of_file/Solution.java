package introduction.java_end_of_file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int i = 0;
		
		while (scanner.hasNextLine()) {
			System.out.println(++i + " " + scanner.nextLine());
		}
	}
}
