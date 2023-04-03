package tutorials;
import java.util.Scanner;

public class FindingGreatestNumber {
	static int first,second,third;
	static int result = 0;
	public static int FindingGreatest(int firstNum,int secondNum,int thirdNum) {
		first = firstNum;
		second = secondNum;
		third = thirdNum;
		result = thirdNum > ( (firstNum > secondNum) ? firstNum:secondNum ) ?
				thirdNum : ((firstNum > secondNum) ? firstNum:secondNum) ;
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		System.out.print(" Enter the first number: ");
		int firstNum = scan.nextInt();
		System.out.print(" Enter the second number: ");
		int secondNum = scan.nextInt();
		System.out.print(" Enter the third number: ");
		int thirdNum = scan.nextInt();
		result = FindingGreatest(firstNum,secondNum,thirdNum);
		System.out.println(" The greatest is: " + result);
		scan.close();
	}
}
