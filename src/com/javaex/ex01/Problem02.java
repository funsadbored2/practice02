package com.javaex.ex01;

import java.util.Scanner;

public class Problem02 {
	
	public static void main(String[] args) {

		int[] num = new int[5];
		float sum = 0f;

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 5개를 입력하세요:");

		for (int i = 0; i < 5; i++) {

			num[i] = sc.nextInt();

			sum = sum + num[i];
		}

		System.out.println("평균은 " + sum / 5.0 + " 입니다.");

		sc.close();
	}

}
