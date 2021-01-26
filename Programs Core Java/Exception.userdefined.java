package exceptions.userDefined;

import java.util.Scanner;

import exceptions.userDefined.customException.InvalidAgeException;

public class AgeValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		if(age >= 18)
			System.out.println("Eligible for voting ");
		else 
			try {
				throw new InvalidAgeException();
			}catch(InvalidAgeException i) {
				System.out.println("Below   18 years ,Not eligible for voting ");
			}
	}

}

package exceptions.userDefined;

import java.util.Scanner;

public class UserDemo {

	public static void main(String[] args)  throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n >= 0)
			System.out.println(n + " is a postive number");
		else {
			
			throw new Exception("Negative Number ");
		}
	}
}
