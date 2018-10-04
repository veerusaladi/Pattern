package com.app;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		int k=6;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
		System.out.println();
		for (int j = 0; j < m; j++) {
			System.out.print(" ");
		}
		
		for (int j = 0; j < k; j++) {
			System.out.print("*");
		}
			k=k-2;
			m=m+2;
			System.out.println();
			
		}
	}

}
