// https://www.hackerrank.com/challenges/java-comparator/problem

package data_structures.java_comparator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (((Player) o1).score > ((Player) o2).score) {
			return -1;
		} else if (((Player) o1).score < ((Player) o2).score) {
			return 1;
		} else {
			return ((Player) o1).name.compareTo(((Player) o2).name);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		return false;
	}
	
}

class Player {
	String name;
	int score;
	
	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + " " + score;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		Player[] players = new Player[n];
		Checker checker = new Checker();
		
		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			int score = scanner.nextInt();
			players[i] = new Player(name, score);
		}
		
		Arrays.sort(players, checker);
		
		for (Player player : players) {
			System.out.println(player);
		}
	}
}
