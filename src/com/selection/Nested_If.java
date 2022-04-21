package com.selection;

public class Nested_If {
	public static void main(String[] args) {
		int a=10;
		if(a>6) {
			System.out.println("Condition True Outer");
			if(a>5) {
				System.out.println("Condition true inner");
			}else {
				System.out.println("invalid input inner");
			}
		}else {
			System.out.println("invalid input outer");
		}
	}

}
