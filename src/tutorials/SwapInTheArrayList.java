package tutorials;

import java.util.ArrayList;
import java.util.Scanner;
public class SwapInTheArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> colors = new ArrayList<String> ();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		System.out.print("Before swapping:");
		for(String i:colors) {
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("Enter the indexs you want to switch:");
		int firstIndex = scan.nextInt();
		int secondIndex = scan.nextInt();
		String temp = null;
		
		temp = colors.get(firstIndex);
		colors.set(firstIndex,colors.get(secondIndex));
		colors.set(secondIndex,temp);
		System.out.println("After swapping:");
		for(String i:colors) {
			System.out.print( i + " ");
		}
		scan.close();
	}
}
