package com.selection;

public class If_Condition_UsingString {
	public static void main(String[] args) {
		String a = "rooba";
		String b = "rooBA";
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Pass");
			if (a.equals(b)) {
				System.out.println("a is not equal to b");
			}

		} else {
			System.out.println("Condition fail");
		}

	}}


