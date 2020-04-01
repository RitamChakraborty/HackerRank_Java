package advanced.prime_checker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

class Prime {
	private boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 2; i <= (int) Math.sqrt(num); ++i) {
				if (num % i == 0) {
					return false;
				}
			}
			
			return true;
		}
	}
	
	public void checkPrime(int... arr) {
		StringBuilder string = new StringBuilder();
		
		for (int i : arr) {
			if (isPrime(i)) {
				string.append(i).append(" ");
			}
		}
		
		System.out.println(string);
	}
}

public class Solution {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}


