package com.app;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for (int i = 1; i < 5; i++) {
				for (int j = 0; j < i ; j++) {
					System.out.print(" *");
				}
				for (int j = 0; j < 3; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			for (int k = 3; k >=0; k--) {
				for (int n = 0; n < k ; n++) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}

}
