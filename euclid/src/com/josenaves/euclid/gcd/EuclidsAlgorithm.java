package com.josenaves.euclid.gcd;

/**
 * Compute the greatest common divisor of two nonnegative numbers.
 * @author @josenaves
 */
public class EuclidsAlgorithm {

	public static void main(String[] args) {
		System.out.println("GCD of 2 and 3 = " + gcd(2, 3));
		System.out.println("GCD of 2 and 4 = " + gcd(2, 4));
		System.out.println("GCD of 77 and 35 = " + gcd(77, 35));
		System.out.println("GCD of 10 and 12 = " + gcd(10, 12));
	}
	
	/**
	 * Compute the greatest common divisor of two nonnegative integers p and q as follows: 
	 * If q is 0, the answer is p. If not, divide p by q and take the remainder r. 
	 * The answer is the greatest common divisor of q and r.
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		
		// remainder r : remainder of division of p and q
		int r = p % q;
		return gcd(q, r);
	}
}
