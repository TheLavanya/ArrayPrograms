import java.util.HashMap;
import java.util.Hashtable;

public class LengthOfLargestSubarrayWith0Sum {

	public static void main(String[] args) {

		//int input[] = { 15, -2, 0, -8, 3, 7, 10, 23 };
		int input[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println("Max length using approach 1 :- " + approach1(input, input.length));
		//System.out.println("Max length using approach 2 :- " + approach2(input, input.length));
		System.out.println("Max length using approach 3 :- " + approach3(input, input.length));
	}

	// Using 3 nested loops - Time complexity- O(n3)
	private static int approach1(int a[], int n) {
		int maxLen = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if (sum == 0) {
					if (maxLen < j - i + 1) {
						maxLen = j - i + 1;
					}
				}
			}
		}
		return maxLen;
	}

	// Using 2 nested loops- Time complexity- O(n2)-  Not working 
//	private static int approach2(int a[], int n) {
//		int maxLen = 0;
//		for (int i = 0; i < n; i++) {
//			int sum = 0;
//			for (int j = i; j < n; j++) {
//				sum = sum + a[j];
//				if (sum == 0) {
//					maxLen = Math.max(maxLen, j - i + 1);
//				}
//			}
//		}
//		return 0;
//	}

	// Using hashmap- Time complexity- O(n)
	private static int approach3(int a[], int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0; // Initialize sum of elements
		int maxLen = 0; // Initialize result

		// Traverse through the given array
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];

			if (a[i] == 0 && maxLen == 0)
				maxLen = 1;

			if (sum == 0) {
				maxLen = i + 1;
			}
			if (hm.containsKey(sum)) {
				int prev_index = hm.get(sum);
				maxLen = Math.max(maxLen, i - prev_index);
			} else {
				hm.put(sum, i);
			}
		}
		return maxLen;
	}

}
