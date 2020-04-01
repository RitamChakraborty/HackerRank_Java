package big_numbers.java_big_decimal;

import java.math.BigDecimal;
import java.util.Scanner;

class Solution {
	
	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		
		for (int i = n - 1; i >= 0; --i) {
			String temp = s[i];
			int j = i + 1;
			
			while (j < n && new BigDecimal(s[j]).compareTo(new BigDecimal(temp)) > 0) {
				s[j - 1] = s[j];
				++j;
			}
			
			s[j - 1] = temp;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}