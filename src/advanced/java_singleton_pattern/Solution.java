package advanced.java_singleton_pattern;

class Singleton {
	private static Singleton singleInstance;
	public String str;
	
	private Singleton() {
		str = "Hello I am a singleton! Let me say hello world to you";
	}
	
	public static Singleton getSingleInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton();
		}
		
		return singleInstance;
	}
}

public class Solution {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleInstance();
		System.out.println(singleton.str);
	}
}
