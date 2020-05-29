import java.util.HashSet;

public class AnyPairFromListUptoGivenNumber {

	public static void main(String[] args) {
		int a[] = { 10,15,3,7 };
		int n = 17;
		printPairs(a, n);
	}

	private static void printPairs(int[] a, int sum) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			int temp = sum - a[i];

			// Checking for condition
			if (set.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + a[i] + ", " + temp + ")");
			}
			set.add(a[i]);
		}
	}

}
