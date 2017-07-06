package com.javaex.ex01;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("금액:");
		int money = sc.nextInt();
		int[] won = new int[10];

		won[0] = 50000;
		won[1] = 10000;
		won[2] = 5000;
		won[3] = 1000;
		won[4] = 500;
		won[5] = 100;
		won[6] = 50;
		won[7] = 10;
		won[8] = 5;
		won[9] = 1;

		for (int i = 0; i < won.length; i++) {

			int num;

			if (money >= won[i]) {

				num = money / won[i];
				money = money - (won[i] * num);
				System.out.println(won[i] + "원: " + num + "개");

				continue;

			}
		}

		sc.close();

	}

}
