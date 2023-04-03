package tutorials;
import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<String> ();
		languages.add("Python");
		languages.add("JAVA");
		languages.add("PHP");
		languages.add("Perl");
		languages.add("C#");
		
		String[] arr = new String[languages.size()];
		arr = languages.toArray(arr);
		
		for(String i:arr) {
			System.out.print( i + " ");
		}
	}

}
