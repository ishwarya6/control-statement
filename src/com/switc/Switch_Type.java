package com.switc;

public class Switch_Type {
	public static void main(String[] args) {
		int month = 3;
		int weak = 7;
		switch (month) {
		case 1:
			System.out.println("Condition 1");
			break;
		case 2:
			System.out.println("Condition 2");
			break;
		case 3:
			System.out.println("Condition 3");
			break;
		case 4:
			System.out.println("Condition 4");
			break;

		default:
			System.out.println("invalid input");
			break;
		}

		switch (weak) {
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7 is true");
			break;

		default:

			System.out.println("invalid");
			break;
		}
	}

}
