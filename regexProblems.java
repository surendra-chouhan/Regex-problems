import java.util.regex.*;
import java.util.Scanner;

public class regexProblems{
	boolean validName;
	String firstName;

	Scanner sc = new Scanner(System.in);

	public void validateFirstName(){
		System.out.println("Enter First Name (It should start with Capital Letter and have atleast 3 letters)");
		firstName = sc.next();

		validName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
		System.out.println(validName);
		if(validName == true){
			System.out.println("First Name is valid");
		}
		else{
			System.out.println("First Name is not valid");
		}

	}

	public static void main(String args[]){
		regexProblems user = new regexProblems();

		user.validateFirstName();
	}
}
