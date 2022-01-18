
public class Search {

	public static int linearSearch(int[] arr, int key) {
		System.out.println("Starting Linear Search");
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		System.out.println("Could not be found!");
		return -1;
	}

	public static int binarySearchRek(int[] arr, int key, int l, int m, int r) {
		if (arr[m] == key) {
			return m;
		} else {
			if (arr[m] > key) {
				l = m + 1;
				m = l + (r - l) / 2;
				return binarySearchRek(arr, key, l, m, r);
			} else {
				r = m - 1;
				m = l + (r - l) / 2;
				return binarySearchRek(arr, key, l, m, r);

			}
		}

	}
}
