import java.util.Random;

public class Helper {

	public static int[] getArray() {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
}
