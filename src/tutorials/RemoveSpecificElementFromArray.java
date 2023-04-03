package tutorials;
import java.util.Scanner;
public class RemoveSpecificElementFromArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter array size: ");
		int arraySize = scan.nextInt();
		int[] arr = new int[arraySize];
		int[] updateArr = new int[arraySize-1];
		System.out.println(" Enter values for array(Please be careful not to exceed array size!");
		for( int i = 0; i < arraySize; i++) {
			System.out.print("Enter value for " + i + ":");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter index number you want to remove:");
		int index = scan.nextInt();
		
		if(arr == null || index < 0 || index > arr.length ) {
			System.out.println("Check your input! ");
		}
		
		for(int i = 0,j = 0; i < arr.length; i++) {
			updateArr[j] = arr[i]; 
			if( i == index ) {
				continue;
			}
			j++;
		}
		for(int i:updateArr) {
			System.out.println(i);
		}
		scan.close();
	}
}
