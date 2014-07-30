package com.josenaves.algorithms.fibonacci;

/**
 * Fibonacci sequence.
 * 
 * Sequence initiated in 0, 1 and the next numbers are calculated by the sum of their ancestors.
 * 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181...
 * 
 * @author @josenaves
 */
public class Fibonacci {

	public static void main(String[] args) {
		// show the first 10 numbers
		for (int i = 0; i < 10; i++) System.out.print(fibo(i) + " ");
	}
	
	private static int fibo(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
	}

}
