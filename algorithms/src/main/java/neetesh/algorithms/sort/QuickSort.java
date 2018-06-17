package neetesh.algorithms.sort;

import neetesh.algorithms.utils.Utilities;

public class QuickSort {

	public static <T> void sort(T[] in) {
		Utilities.randomize(in);
		sort(in, 0, in.length - 1);
	}

	private static <T> void sort(T[] in, int lo, int hi) {

		if (hi <= lo) {
			return;
		}

		int i = lo;
		int j = hi + 1;

		do {

			while (Utilities.compare(in, ++i, lo) < 0 && i != hi)
				;

			while (Utilities.compare(in, --j, lo) > 0 && j != lo)
				;

			if (i < j) {
				Utilities.swap(in, i, j);
			}

		} while (i < j);

		if (in[lo] != in[j]) {
			Utilities.swap(in, lo, j);
		}

		sort(in, lo, j - 1);
		sort(in, j + 1, hi);

	}

	public static <T> void invertedSort(T[] array) {
		Utilities.randomize(array);
		invertedSort(array, 0, array.length - 1);

	}

	public static <T> void invertedSort(T[] array, int start, int end) {
		if (end <= start) {
			return;
		}

		int i = start;
		int j = end + 1;

		do {

			while (Utilities.compare(array, ++i, start) > 0 && i != end)
				;

			while (Utilities.compare(array, --j, start) < 0 && j != start)
				;

			if (i < j) {
				Utilities.swap(array, i, j);
			}

		} while (i < j);

		if (array[start] != array[j]) {
			Utilities.swap(array, start, j);
		}

		invertedSort(array, start, j - 1);
		invertedSort(array, j + 1, end);

	}

}
