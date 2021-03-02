import java.util.regex.*;
import java.util.Scanner;

public class regexProblems{
	String firstName;
	String lastName;
	String email;

	Scanner sc = new Scanner(System.in);

	public void validateFirstName(){
		System.out.println("\nEnter First Name (It should start with Capital Letter and have atleast 3 letters)");
		firstName = sc.next();

		boolean validFirstName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
		if(validFirstName == true){
			System.out.println("\nFirst Name is valid");
		}
		else{
			System.out.println("\nFirst Name is not valid");
		}

	}

	public void validateLastName(){
		System.out.println("\nEnter Last Name (It should start with Capital Letter and have atleast 3 letters)");
		lastName = sc.next();

		boolean validLastName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
		if(validLastName == true){
			System.out.println("\nLast Name is valid");
		}
		else{
			System.out.println("\nLast Name is not valid");
		}

	}

	public void validateEmail(){
		System.out.println("\nEnter Emaild ID : ");
		email = sc.next();

		boolean validEmail = Pattern.compile("^[a-zA-Z0-9]+(?:[\\+._-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$").matcher(email).matches();

		if(validEmail == true){
			System.out.println("\nEmail ID is valid");
		}
		else{
			System.out.println("\nEmail ID is not valid");
		}
	}

	public static void main(String args[]){
		regexProblems user = new regexProblems();

		user.validateFirstName();
		user.validateLastName();
		user.validateEmail();
	}
}
