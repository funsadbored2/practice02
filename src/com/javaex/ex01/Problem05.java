package com.javaex.ex01;

public class Problem05 {

	public static void main(String[] args) {

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1;

			for (int j = 1; j < num.length; j++) {

				if (num[j] != num[i]) {

					continue;

				} else {

				}

			}

			System.out.print(num[i] + "\t");

		}

	}

}
