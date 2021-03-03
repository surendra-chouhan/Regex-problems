import java.util.regex.*;
import java.util.Scanner;

public class regexProblems{
	String firstName;
	String lastName;
	String mobileNumber;
	String password;

	Scanner sc = new Scanner(System.in);

	public void validateFirstName(){
		System.out.println("\nEnter First Name (It should start with Capital Letter and have atleast 3 letters)");
		firstName = sc.nextLine();

		boolean validFirstName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
		if(validFirstName == true){
			System.out.println("\nFirst Name is valid");
		}
		else{
			System.out.println("\nFirst Name is not valid. \nEnter again");
			validateFirstName();
		}

	}

	public void validateLastName(){
		System.out.println("\nEnter Last Name (It should start with Capital Letter and have atleast 3 letters)");
		lastName = sc.nextLine();

		boolean validLastName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
		if(validLastName == true){
			System.out.println("\nLast Name is valid");
		}
		else{
			System.out.println("\nLast Name is not valid \nEnter again");
			validateLastName();
		}

	}

	public void validateEmail(){
		String[] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com","abc111@yabc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
									"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
									"abc@gmail.com.1a","abc@gmail.com.aa.au"};

		for(int i=0; i<email.length; i++) {
			boolean validEmail = Pattern.compile("^[a-zA-Z0-9]+(?:[\\+._-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]{1,}(?:\\.[a-zA-Z]{2,5})?(?:\\.[a-zA-Z]{2,5})?$").matcher(email[i]).matches();

			if(validEmail == true) {
				System.out.println("\nEmail ID " + email[i] + " is Valid");		}
			else {
				System.out.println("\nEmail Id " +email[i] + " is Invalid");
			}
		}
	}

	public void validateMobileNumber(){
		System.out.println("\nEnter Phone Number : ");
		mobileNumber = sc.nextLine();

		boolean validMobileNumber = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(mobileNumber).matches();

		if(validMobileNumber == true){
			System.out.println("\nMobile Number is valid");
		}
		else{
			System.out.println("\nMobile Number is not valid \nEnter again");
			validateMobileNumber();
		}

	}

	public void validatePassword(){
		System.out.println("\nEnter Password : ");
		password = sc.nextLine();

		boolean validPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}").matcher(password).matches();

		if(validPassword == true){
			System.out.println("Password is valid");
		}
		else{
			System.out.println("Password is not valid \nEnter again");
			validatePassword();
		}
	}

	public static void main(String args[]){
		regexProblems user = new regexProblems();

		user.validateFirstName();
		user.validateLastName();
		user.validateEmail();
		user.validateMobileNumber();
		user.validatePassword();
	}
}
