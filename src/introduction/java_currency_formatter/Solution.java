// https://www.hackerrank.com/challenges/java-currency-formatter/problem

package introduction.java_currency_formatter;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		numberFormat.setCurrency(Currency.getInstance("USD"));
		String us = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		numberFormat.setCurrency(Currency.getInstance(new Locale("en", "IN")));
		String india = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		numberFormat.setCurrency(Currency.getInstance(Locale.CHINA));
		String china = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		numberFormat.setCurrency(Currency.getInstance(Locale.FRANCE));
		String france = numberFormat.format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}

