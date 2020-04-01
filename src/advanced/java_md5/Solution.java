// https://www.hackerrank.com/challenges/java-md5/problem

package advanced.java_md5;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.out.printf("%032x", new java.math.BigInteger(1, java.security.MessageDigest.getInstance("md5").digest(new java.util.Scanner(System.in).next().getBytes())));
	}
}
