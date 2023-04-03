package tutorials;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input number:");
		int number = scan.nextInt();
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i ;j <= number; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
		
		for(int i = number-1; i >= 1; i--) {
			for(int j = 1;j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j <= number; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
