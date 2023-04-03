package tutorials;
import java.util.Scanner;
public class PasswordStrongOrWeak {

	public static void main(String[] args) {
		boolean upperChar = false;
		boolean lowerChar = false;
		boolean isNumber = false;
		boolean isSpecial = false;
		final int MUST_HAVE_LENGTH = 8;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter password: ");
		String password = scan.nextLine();

		if( password.length() < MUST_HAVE_LENGTH ) {
			System.out.print("Please enter a password at least 8:" );
		}
		else {
			for( int i = 0; i < password.length(); i++) {
				char character = password.charAt(i);
				if(Character.isUpperCase(character)) {
					upperChar = true;
				}else if(Character.isLowerCase(character)) {
					lowerChar = true;
				}else if(Character.isDigit(character)) {
					isNumber = true;
				}else {
					isSpecial = true;
				}
			}
		}
		
		if( upperChar && lowerChar && isNumber && isSpecial) {
			System.out.println(" Your password is strong! ");
		}
		else {
			System.out.println(" Your password is weak! ");
		}
		scan.close();
	}

}
