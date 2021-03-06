/*
/ MacchiaroliM
/ CS2
/ Mar 20 2018
/ Triangle Class Lab 6
*/
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	int i = 0;
	Scanner input = new Scanner(System.in);
	do {
	System.out.println("Enter a positive integer: ");
	i = input.nextInt();
	} while (i <= 0);
	recursiveTriangle(i);//print triangle
}
	public static String iterativeTriangle(int n) {//build triangle
		String Triangle = "";//set string
		int row = n;//set working row
		for (int c=n; c>0; c--) {
			for (int i=0; i<row; i++) {
				Triangle = Triangle + "*";//create row of triangle
			}
			row--;
			Triangle = Triangle + "\n";//add line to triangle
		}
		return Triangle;
	}
	public static void recursiveTriangle(int n) {//print Triangle
		String Triangle = "";//set string
		int row = n;//set working row
		if (n == 0) {System.exit(0);}//break if 0
		for (int i=0; i<row; i++) {
			Triangle = Triangle + "*";//create row of triangle
		}
		System.out.println(Triangle);//print triangle
		recursiveTriangle(n-1);//get next row
	}
}

