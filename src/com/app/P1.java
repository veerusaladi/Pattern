package com.app;

public class P1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int n=5;
		int z=1;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");
				sleep(1000);
				}
			for (int k = 0; k < z; k++) {
				System.out.print(z-k);
				sleep(1000);
				}
			z=z+2;
			System.out.println();
			}
		}
	}
