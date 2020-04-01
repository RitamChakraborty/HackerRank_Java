// https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem

package object_oriented_programming.java_method_overriding_2_super_keyword;

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		
		String temp = super.define_me();
		
		System.out.println("My ancestor is a cycle who is " + temp);
	}
	
	String define_me() {
		return "a cycle with an engine.";
	}
	
}

class Solution {
	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}
}
