
/*
 * Sorted Merge: You are given two sorted arrays, A and B, where A has a 
 * large enough buffer at the end to hold B. Write a method to merge Binto A in sorted order.*/
public class SortedMerge {
	
	static void merge(int a[], int b[], int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int mergedIndex= lastA+lastB-1;   // indexA+indexB+1
		
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[mergedIndex] = a[indexA];
				indexA--;
			} else {
				a[mergedIndex] = b[indexB];
				indexB--;
			}
			mergedIndex--;
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[15];
		int i = 0;
		a[i++] = 12;
		a[i++] = 35;
		a[i++] = 38;
		a[i++] = 40;
		a[i++] = 45;
		a[i++] = 55;
		int b[] = new int[] { 11, 36, 42, 45, 55, 90 };
		System.out.println("Array A : ");
		for (int j = 0; j < i; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println("\nArray B : ");
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]+" ");
		}
		merge(a, b, i, b.length);
		System.out.println("\nAfter merge : ");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
