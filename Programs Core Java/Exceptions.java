package exceptions;


import java.util.Scanner;

public class demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=0,n2=0;
		try {
			 n1 = sc.nextInt();// 2.3
			 n2 = sc.nextInt();// 0

			System.out.println(n1 / n2);// 8/0--
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Remaining Code ....");
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		sc.close();
	}

}

package exceptions;

public class ThrowsDemo {
	public static void main(String[] args) {
		
		int n1=23,n2=5;
		char option='o';
		try {
		Calculation( n1,n2,option);
	} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void Calculation(int n1, int n2, char option) throws ArithmeticException,NullPointerException{
		
		
	
		switch (option) {
		case 'a' : System.out.println(n1+n2);
		break;
		
		
		case 's' : System.out.println(n1-n2);
		break;
		
		case 'd' : System.out.println(n1/n2);
		break;
		
		//default : System.out.println("Wrong option");
		}
	}

}