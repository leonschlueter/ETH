
public class Sort {

	public static void bubbleSort(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}

	}

	public static void mergeSort(int[] A) {
		final int n = A.length;
		int[] b = new int[n];
		int s = 1;

		while (s < n) {
			int r = 0;
			while (r < n) {
				int l = r;
				int m = Math.min(l + s, n - 1);
				r = Math.min(m + s, n);
				merge(A, b, l, m, r);
			}
			s *= 2;
		}
	}

	private static void merge(int[] A, int[] B, int l, int m, int r) {
		int i = l;
		int j = m;
		int k = 0;
		while (i < m && j < r) {
			if (A[i] <= A[j]) {
				B[k] = A[i];
				i++;
				k++;
			} else {
				B[k] = A[j];
				j++;
				k++;
			}
		}

		while (i < m) {
			B[k] = A[i];
			k++;
			i++;
		}
		while (j < r) {
			B[k] = A[j];
			k++;
			j++;
		}
		for (int f = 0; f < k; f++) {
			A[l + f] = B[f];
		}
	}

	public static void selectionSort(int[] A) {
		for (int i = A.length - 1; i >= 0; i--) {
			int m = 0;
			for (int j = 0; j <= i; j++) {
				m = A[j] > A[m] ? j : m;
			}
			int temp = A[m];
			A[m] = A[i];
			A[i] = temp;
		}
	}

	public static int[] exchangeSort(int[] A) {
		return A;
	}

	public static void insertionSort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int k = ub(A, 0, i, A[i]);
			int temp = A[i]; // copy current element
			for (int j = i; j > k; j--) { // shift all elements between i and k (k included) one index to the right
				A[j] = A[j - 1];
			}
			A[k] = temp; // place k at correct position
		}
	}

	private static int ub(int[] a, int l, int r, int val) {
		while (l < r) {
			int m = l + (r - l) / 2;
			if (a[m] == val) {
				if (m < r && a[m + 1] == val)
					l = m + 1; // like binary search, except if there are multiple elements continue until
								// right end of them is found
				else
					return m;
			} else if (a[m] < val)
				l = m + 1;
			else
				r = m;
		}
		return l;
	}
}
