package tutorials;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PositiveOrNegative {
	static void positiveOrNegative(int num) {
		if( num > 0) {
			System.out.print(" The number is positive. ");
		}else{
			System.out.print(" The number is negative. ");
		}

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.print(" Enter a number: ");
		try {
			number = scan.nextInt();
			positiveOrNegative(number);
		}
		catch(InputMismatchException e) {
			System.out.println (" Please Enter valid number ");
		}
		scan.close();
	}
}
