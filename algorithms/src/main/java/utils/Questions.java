package utils;

import sort.QuickSort;

public class Questions {

	private static int findDiff(int[] array) {
		int low = 0;
		int hi = 0;
		int tempLow = 0;
		int maxDiff = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[low]) {
				tempLow = i;
			} else if (array[i] - array[tempLow] >= maxDiff) {
				hi = i;
				low = tempLow;
				maxDiff = array[i] - array[tempLow];
			}
		}
		return array[hi] - array[low];
	}

	private static int findSmall(int[] array, int indexOfMax) {
		int diff = 0;
		int indexOfMin = 0;
		for (int i = 0; i <= indexOfMax; i++) {
			int newDiff = array[indexOfMax] - array[i];
			if (newDiff > diff) {
				indexOfMin = i;
				diff = newDiff;
			}
		}
		return indexOfMin;

	}

	private static int max(int[] array) {

		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= array[index]) {
				index = i;
			}
		}
		return index;
	}

	public static int maxDifference(int[] a) {

		int min = a[0];
		int max = a[1];

		if (max > min) {
			int temp = min;
			min = max;
			max = temp;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}

		return max - min;

	}

	static int lastIndexOf(Integer[] a, int num) {

		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;

		do {

			if (a[mid] == num) {
				if (mid < last) {
					if (a[mid + 1] > a[mid]) {
						return mid;
					} else { // (a[mid + 1] == a[mid])
						first = mid + 1;
						mid = (first + last) / 2;
					}
				} else {
					return mid;
				}
			} else if (a[mid] > num) {
				last = mid - 1;
				mid = (first + last) / 2;
			} else {
				first = mid + 1;
				mid = (first + last) / 2;
			}
		} while (true);
	}

	static int countDuplicates(Integer[] numbers) {

		int duplicateCount = 0;

		QuickSort.sort(numbers);

		for (int i = 0; i < numbers.length;) {
			int num = numbers[i];
			int lastIndex = lastIndexOf(numbers, num);
			if (lastIndex - i > 0) {
				duplicateCount++;
			}
			i = lastIndex + 1;

		}
		return duplicateCount;
	}

}
