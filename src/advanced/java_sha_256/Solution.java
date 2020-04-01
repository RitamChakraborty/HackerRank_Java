// https://www.hackerrank.com/challenges/sha-256/problem

package advanced.java_sha_256;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.out.printf("%064x", new java.math.BigInteger(1, java.security.MessageDigest.getInstance("SHA-256").digest(new java.util.Scanner(System.in).next().getBytes())));
	}
}
