package com.jump;

public class Jumping {
	private String ishu() {

		return "dakshu";

	}

	public static void main(String[] args) {
		Jumping j = new Jumping();
		System.out.println(j.ishu());

		System.out.println("**************");

		for(int i=0; i<10; i++) {

			if (i == 3)
				break;
			System.out.println(i);
		}
			System.out.println("*************");
			for(int k=0; k<8; k++) {
				if(k==5)
					continue;
				System.out.println(k);
			}
		
	}
}
