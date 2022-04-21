package com.switc;

import java.util.Scanner;

public class Switch_Type2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the month");

		String month = "December";
		switch (month) {

		case "January":
			String january = i.nextLine();
			System.out.println("1st Month:" + january);
			break;
		case "Febrauary":
			String Febrauary = i.next();
			System.out.println("2nd Month:" + Febrauary);
			break;
		case "December":
			String December = i.next();
			System.out.println("12th Month:" + December);
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}

}
