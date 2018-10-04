package com.app;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ph=5;
		int ps=ph-1;
		int ms=1;
		for (int i = 0; i < ph; i++) {
			for (int j = 0; j < ps-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < ms ; k++) {
				System.out.print("*");
			}
			ms=ms+2;
			System.out.println();
		}
	}

}
