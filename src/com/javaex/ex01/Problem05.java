package com.javaex.ex01;

public class Problem05 {

	public static void main(String[] args) {

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {

			for(int j = 0; j < num.length; j++ ) {
				
				if(j == i) {
					continue;
				}
				
				num[i] = (int) (Math.random() * 100) + 1;
				
				
				if(num[j] == num[i]) {
					j = j-1;
					continue;
				}	
				
			}
          for(int x = 0; x < 101; x++) {
			
        	  
        	  
        	  System.out.print(num[i]);
          }

		}

	}

}
