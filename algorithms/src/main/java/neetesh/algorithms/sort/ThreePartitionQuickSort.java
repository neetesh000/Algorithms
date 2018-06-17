package neetesh.algorithms.sort;

import neetesh.algorithms.utils.Utilities;

public class ThreePartitionQuickSort {

	public static <T> void sort(T[] in) {

		Utilities.randomize(in);
		sort(in, 0, in.length - 1);
	}

	public static <T> void sort(T[] in, int lo, int hi) {

		if (hi <= lo) {
			return;
		}

		int lt = lo;
		int gt = hi;

		T v = in[lo];

		int i = lo + 1;

		while (i <= gt) {
			int diff = Utilities.compare(in[i], v);
			if (diff < 0) {
				Utilities.swap(in, i++, lt++);
			} else if (diff > 0) {
				Utilities.swap(in, i, gt--);
			} else {
				i++;
			}
		}

		sort(in, lo, lt - 1);
		sort(in, gt + 1, hi);

	}

	public static <T> void invertedSort(T[] in) {

		Utilities.randomize(in);
		invertedSort(in, 0, in.length - 1);
	}

	public static <T> void invertedSort(T[] in, int lo, int hi) {

		if (hi <= lo) {
			return;
		}

		int gt = lo;
		int lt = hi;

		T v = in[lt];

		int i = lt - 1;

		while (i >= gt) {
			int diff = Utilities.compare(in[i], v);
			if (diff < 0) {
				Utilities.swap(in, i--, lt--);
			} else if (diff > 0) {
				Utilities.swap(in, i, gt++);
			} else {
				i--;
			}
		}

		invertedSort(in, lo, gt - 1);
		invertedSort(in, lt + 1, hi);

	}

}
