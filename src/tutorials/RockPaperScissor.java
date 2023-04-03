package tutorials;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSOR = 2;
		System.out.println(" Welcome to the rock,paper,scissor game! ");
		System.out.println(" Choose your move:(0 for rock, 1 for Paper,2 for Scissors)");
		int userMove = scan.nextInt();
		if( userMove > 3) {
			System.out.println(" Please enter valid number! ");
		}
		Random random = new Random();
		int computerMove = random.nextInt(3);
		System.out.println(computerMove);
		 if( computerMove == 0) {
			 System.out.println(" Computer chooses rock! ");
		 }else if(computerMove == 1) {
			 System.out.println(" Computer chooses paper! ");
		 }else {
			 System.out.println(" Computer chooses scissors!! ");
		 }
		 
		if(computerMove == userMove) {
			System.out.println(" It's a draw! ");
		}else if(computerMove == ROCK) {
			if( userMove == PAPER ) {
				System.out.println(" You Win! ");
			}else {
				System.out.println(" Computer Win! ");
			}
		}else if(computerMove == PAPER) {
			if(userMove == ROCK) {
				System.out.println(" Computer Win! ");
			}else {
				System.out.println(" You Win! ");
			}
		}else if(computerMove == SCISSOR) {
			if(userMove == ROCK) {
				System.out.println(" You Win! ");
			}else {
				System.out.println(" Computer Win! ");
			}
		}
		scan.close();
	}

}
