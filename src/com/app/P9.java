package com.app;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=9;
		int l=5;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j <i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <z ; k++) {
				System.out.print("*");
			}
			z=z-2;
			System.out.println();
			
		}
	}

}
