// https://www.hackerrank.com/challenges/java-sort/problem

package data_structures.java_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	static Comparator<Student> comparator;
	
	static {
		comparator = (o1, o2) -> {
			if (o1.cgpa > o2.cgpa) {
				return -1;
			} else if (o1.cgpa < o2.cgpa) {
				return 1;
			} else {
				return o1.name.compareTo(o2.name);
			}
		};
	}
	
	int id;
	String name;
	double cgpa;
	
	Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = Integer.parseInt(scanner.nextLine());
		ArrayList<Student> students = new ArrayList<>(n);
		
		for (int i = 0; i < n; ++i) {
			String input = scanner.nextLine();
			
			int id = Integer.parseInt(input.split(" ")[0]);
			String name = input.split(" ")[1];
			double cgpa = Double.parseDouble(input.split(" ")[2]);
			
			students.add(new Student(id, name, cgpa));
		}
		
		students.sort(Student.comparator);
		students.forEach(System.out::println);
	}
}
