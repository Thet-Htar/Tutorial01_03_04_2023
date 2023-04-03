package tutorials;

public class Average {

	public static void main(String[] args) {
		int[] arr = { 3,4,5,7,9 };
		int total = 0;
		double average = 0.0;
		double length = arr.length;
		for(int i:arr) {
			total += i;
			average = total / length;
		}
		System.out.println(average);
		}
}
