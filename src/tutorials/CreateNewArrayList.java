package tutorials;

import java.util.ArrayList;

public class CreateNewArrayList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String> ();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Black");
		colors.add("White");
		
		for(String i:colors) {
			System.out.print( i + " ");
		}
	}
}
