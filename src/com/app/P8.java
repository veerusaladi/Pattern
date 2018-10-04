package com.app;

public class P8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ms=1;
		int h=5;
		int ps=h-1;
		
			for (int i = 0; i < h; i++) {
				for (int j = ps; j >i; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < ms; k++) {
					System.out.print("*");
				}
				ms+=2;
				System.out.println();
			}

	}

}
