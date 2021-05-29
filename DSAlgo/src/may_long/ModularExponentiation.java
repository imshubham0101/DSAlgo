package may_long;

import java.util.Scanner;

public class ModularExponentiation {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextInt();
			long p = 1000000007;

			System.out.println(modExpo1(2, n - 1, p));
		}
	}

	// recursive
	private static long modExpo(long x, long n, long ans) {
		// TODO Auto-generated method stub
		if (n % 2 == 0) {
			if (n == 0)
				return 1;
			ans *= (x * x);
			return modExpo(x, n / 2, ans);
		} else {
			if (n == 1)
				return ans;
			ans *= x;
			return modExpo(x, n - 1, ans);
		}
	}

	// iterative
	private static long modExpo1(long x, long n, long p) {
		long result = 1;
		x = x % p;
		if (x == 0)
			return 0;
		while (n > 0) {
			if (n % 2 == 0) {
				// x = x % p ;
				// result *= (x*x) % p ;
				x = (x * x) % p;
				n = n / 2;
			} else {
				result *= x;
				n = n - 1;
			}
		}
		return result;
	}

}
