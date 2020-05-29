import java.util.Arrays;

public class AnyPairFromListUptoGivenNumberWithSorting {

	public static void main(String[] args) {
		int a[] = { 1, 4, 45, 6, 10, -8 };
		int n = 16;
		int arr_size = a.length;

		// Function calling
		if (hasArray2Candidates(a, arr_size, n)) {
			System.out.println("Array has 2 elements with given sum");
		} else {
			System.out.println("Array doesn't have 2 elements with given sum");
		}
	}

	private static boolean hasArray2Candidates(int[] a, int arr_size, int sum) {

		int left, right;

		// Sort the elements- Use any sorting algo
		Arrays.sort(a);
		
		// Now look for 2 candidates in sorted array
		left = 0;
		right = arr_size - 1;
		while (left < right) {
			if (a[left] + a[right] == sum) {
				System.out.println("2 elements are: " + a[left] + ", " + a[right]);
				return true;
			} else if (a[left] + a[right] < sum) {
				left++;
			} else { //a[left]+a[right]>sum
				right--;
			}
		}

		return false;
	}

}
