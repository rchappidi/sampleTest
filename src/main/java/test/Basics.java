package test;

public class Basics {

	public static void main(String[] args) {

		int a = 0;

		try {

			System.out.println(10 / a);

		} catch (ArithmeticException arithmeticException) {

			System.out.println("dont pass zero as input");

		}

	}

}