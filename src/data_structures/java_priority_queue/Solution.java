package data_structures.java_priority_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private final int id;
	private final double cgpa;
	private final String name;
	
	Student(int id, double cgpa, String name) {
		this.id = id;
		this.cgpa = cgpa;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public int compareTo(Student s) {
		if (getCgpa() != s.getCgpa()) {
			return Double.compare(s.getCgpa(), getCgpa());
		} else if (!getName().equals(s.getName())) {
			return getName().compareTo(s.getName());
		} else {
			return Integer.compare(s.getId(), getId());
		}
	}
}

class Priorities {
	List<Student> students = new ArrayList<>();
	
	List<Student> getStudents(List<String> events) {
		for (String event : events) {
			String[] strings = event.split(" ");
			
			if (strings[0].equals("ENTER")) {
				String name = strings[1];
				double cgpa = Double.parseDouble(strings[2]);
				int id = Integer.parseInt(strings[3]);
				
				students.add(new Student(id, cgpa, name));
				Collections.sort(students);
			} else {
				if (!students.isEmpty()) {
					students.remove(0);
				}
			}
		}
		
		return students;
	}
}

public class Solution {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();
	
	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();
		
		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}
		
		List<Student> students = priorities.getStudents(events);
		
		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}