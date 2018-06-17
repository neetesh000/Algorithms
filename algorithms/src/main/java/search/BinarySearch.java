package search;

import utils.Utilities;

public class BinarySearch {

	public int search(Object[] array, Object a) {
		int l = 0;
		int r = array.length - 1;

		return search(array, a, l, r);
	}

	public int search(Object[] array, Object a, int left, int right) {

		if (left >= right)
			return -1;

		int mid = (left + right) / 2;
		int diff = Utilities.compare(a, array[mid]);

		if (diff == 0) {
			return mid;
		} else if (diff > 0) {
			return search(array, a, left, mid - 1);
		} else {
			return search(array, a, mid + 1, right);
		}

	}

	public boolean isPresent(Object[] array, Object a) {

		int l = 0;
		int r = array.length - 1;

		return isPresent(array, a, l, r);

	}

	public boolean isPresent(Object[] array, Object a, int left, int right) {

		int index = search(array, a, left, right);

		if (index == -1)
			return false;

		return true;

	}

}
