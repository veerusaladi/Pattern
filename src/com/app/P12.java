package com.app;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int m=2;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(" *");
				}
				System.out.println();
				for (int j = 0; j < m; j++) {
					System.out.print(" *");
				}
				m=m+2;
				System.out.println();
			}
	}

}
