package neetesh.algorithms.utils;

import java.util.Random;

public class Utilities {

	public static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static <T> int compare(T[] array, int i, int j) {

		T t1 = array[i];
		T t2 = array[j];

		return compare(t1, t2);
	}

	public static <T> int compare(T t1, T t2) {

		if (t1.equals(t2)) {
			return 0;
		} else {
			return t1.hashCode() - t2.hashCode();
		}

	}

	public static <T> void randomize(T[] array) {

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int ran = rand.nextInt(i + 1);
			swap(array, i, ran);
		}

	}

	public static <T> String arrayAsString(T[] array) {

		StringBuffer buf = new StringBuffer();

		buf.append('[').append(' ');

		for (T t : array) {
			buf.append(t).append(',').append(' ');
		}

		return buf.replace(buf.length() - 2, buf.length() - 1, " ]").toString();

	}

	public static <T> boolean isSorted(T[] array, int lo, int hi) {

		for (int i = lo; i < hi - 1; i++) {

			if (compare(array[i], array[i + 1]) > 0) {
				return false;
			}

		}
		return true;
	}

	public static <T> boolean isSorted(T[] array) {

		int lo = 0, hi = array.length - 1;

		return isSorted(array, lo, hi);

	}

	public static <T> boolean isInvertedSorted(T[] array, int lo, int hi) {

		for (int i = lo; i < hi - 1; i++) {

			if (compare(array[i], array[i + 1]) < 0) {
				return false;
			}

		}
		return true;
	}

	public static <T> boolean isInvertedSorted(T[] array) {

		int lo = 0, hi = array.length - 1;

		return isInvertedSorted(array, lo, hi);

	}

}
