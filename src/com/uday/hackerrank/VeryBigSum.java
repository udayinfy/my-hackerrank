package com.uday.hackerrank;

import java.util.Scanner;

// Avery Big Sum. Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//https://www.hackerrank.com/challenges/a-very-big-sum/problem
public class VeryBigSum {
	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		Long sum = 0l;
		int length = ar.length;
		for (int i = 0; i < length; i++) {
			sum += ar[i];
		}
		return sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	// Below main method was provided by Hackerrank by default
	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * int arCount = scanner.nextInt();
	 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	 * 
	 * long[] ar = new long[arCount];
	 * 
	 * String[] arItems = scanner.nextLine().split(" ");
	 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	 * 
	 * for (int i = 0; i < arCount; i++) { long arItem = Long.parseLong(arItems[i]);
	 * ar[i] = arItem; }
	 * 
	 * long result = aVeryBigSum(ar); System.out.println(result); scanner.close(); }
	 */

	public static void main(String[] args) {
		int argCount = Integer.parseInt(scanner.nextLine());
		long[] ar = new long[argCount];

		String[] arItem = scanner.nextLine().split(" ");
		for (int i = 0; i < arItem.length; i++) {
			ar[i] = Long.parseLong(arItem[i]);
		}

		long result = aVeryBigSum(ar);
		System.out.println(result);
		scanner.close();
	}
}
