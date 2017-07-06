package com.javaex.ex01;

public class Problem03 {
	
	public static void main(String[] args) {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'P', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < 16; i++) {

			System.out.print(c[i]);

		}

		System.out.println();

		for (int i = 0; i < 16; i++) {

			if (i == 4 || i == 7 || i == 9) {

				System.out.print(",");
				continue;

			}

			System.out.print(c[i]);

		}

	}

}
