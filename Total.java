/*
/ MacchiaroliM
/ CS2
/ Mar 20 2018
/ Summing Class Lab 6
*/
import java.util.Scanner;
public class Summing {
	public static void main(String[] args) {
	int i = 0;
	Scanner input = new Scanner(System.in);
	do {
	System.out.println("Enter a positive integer: ");
	i = input.nextInt();
	} while (i <= 0);
	recursiveSum(i);//print Sum
}
	public static String iterativeSum(int n) {//Calc Sum
		int ans = 0;
		int current;
			for (int i=1; i<=n; i++) {
			ans = ans + i;
		}
		return "The sum of the intergers from 1 to " + n + " is " + ans;
	}
	public static void recursiveSum(int n) {//print Sum
		System.out.println(iterativeSum(n));
	}
}

