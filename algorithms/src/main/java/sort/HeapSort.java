package sort;

import utils.Utilities;

public class HeapSort<T> {

	public static void sort(Object[] array) {

		Object[] bigArray = new Object[array.length + 1];

		int n = array.length;
		System.arraycopy(array, 0, bigArray, 1, n);

		heapify(bigArray);
		Utilities.swap(bigArray, n, 1);

		for (int i = n; i >= 1; --i) {
			sink(bigArray, 1, i);
			Utilities.swap(bigArray, i, 1);
		}

		System.arraycopy(bigArray, 1, array, 0, array.length);

	}

	public static void heapify(Object[] array) {

		int n = array.length - 1;

		for (int i = n / 2; i >= 1; i--) {
			sink(array, i, n);
		}

	}

	public static void swim(Object[] array, int i) {

		while (i > 1 && Utilities.compare(array, i, i / 2) < 0) {
			Utilities.swap(array, i, i / 2);
			i /= 2;
		}

	}

	private static void sink(Object[] a, int i, int j) {

		while (i * 2 <= j) {
			int big = i * 2;
			if (big + 1 <= j) {

				if (Utilities.compare(a, big + 1, big) > 0) {
					big = big + 1;
				}
			}

			if (Utilities.compare(a, i, big) >= 0) {
				break;
			}
			Utilities.swap(a, i, big);
			i = big;
		}

	}

	public static void main(String[] args) {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		sort(array);

		System.out.println(Utilities.arrayAsString(array));
	}

}
