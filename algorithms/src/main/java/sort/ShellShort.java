package sort;

import utils.Utilities;

public class ShellShort {

	public static <T> void sort(T[] array) {
		int l = array.length;
		int h = 1;

		while (h < l / 3) {
			h = 3 * h + 1;
		}

		while (h >= 1) {
			for (int i = h; i < l; i++) {
				for (int j = i; j >= h; j -= h) {
					
					if (Utilities.compare(array, j, j-h) < 0) {
						Utilities.swap(array, j, j-h);
					}

				}

			}

			h = h / 3;

		}

	}

}
