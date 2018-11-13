package com.uday.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int length = arr.length;
		int topLeft = arr[0][0];
		int topRight = arr[0][(length - 1)];

		int sumLeftTRight = topLeft;
		int sumRightToLeft = topRight;
		for (int i = 1; i < length; i++) {
			sumLeftTRight += arr[i][i];
		}

		for (int i = (length - 2), j = 1; i >= 0; i--, j++) {
			sumRightToLeft += arr[j][i];
		}

		return Math.abs(sumRightToLeft - sumLeftTRight);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		System.out.println(String.valueOf(result));

		scanner.close();
	}
}
