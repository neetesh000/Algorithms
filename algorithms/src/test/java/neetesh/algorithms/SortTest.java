package neetesh.algorithms;

import org.junit.Assert;
import org.junit.Test;

import neetesh.algorithms.search.BinarySearch;
import neetesh.algorithms.sort.HeapSort;
import neetesh.algorithms.sort.InsertionSort;
import neetesh.algorithms.sort.MergeSort;
import neetesh.algorithms.sort.QuickSort;
import neetesh.algorithms.sort.ShellShort;
import neetesh.algorithms.sort.ThreePartitionQuickSort;
import neetesh.algorithms.utils.Utilities;

public class SortTest {

	@Test
	public void mergeSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		MergeSort.sort(array);

		Assert.assertTrue(Utilities.isSorted(array));
	}

	@Test
	public void invertedMergeSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		MergeSort.invertedSort(array);

		System.out.println(Utilities.arrayAsString(array));

		Assert.assertTrue(Utilities.arrayAsString(array), Utilities.isInvertedSorted(array));

	}

	@Test
	public void threePartitionQuickSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		ThreePartitionQuickSort.sort(array);

		Assert.assertTrue(Utilities.isSorted(array));
	}

	@Test
	public void threePartitionQuickInvertedSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		ThreePartitionQuickSort.invertedSort(array);

		Assert.assertTrue(Utilities.isInvertedSorted(array));
	}

	@Test
	public void quickInvertedSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		QuickSort.invertedSort(array);

		Assert.assertTrue(Utilities.isInvertedSorted(array));
	}

	@Test
	public void quickSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		QuickSort.sort(array);

		Assert.assertTrue(Utilities.isSorted(array));
	}

	@Test
	public void shellSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		ShellShort.sort(array);

		Assert.assertTrue(Utilities.isSorted(array));
	}

	@Test
	public void heapSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		HeapSort.sort(array);

		Assert.assertTrue(Utilities.isSorted(array));
	}

	@Test
	public void insertionSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		InsertionSort.sort(array);

		Assert.assertTrue(Utilities.arrayAsString(array), Utilities.isSorted(array));
	}

	@Test
	public void insertionInvertedSort() {
		Integer[] array = { 1, 8, 5, 40, 8, 2, 6, 324, 6, 23, 534, 5 };

		InsertionSort.invertedSort(array);

		Assert.assertTrue(Utilities.arrayAsString(array), Utilities.isInvertedSorted(array));
	}

	@Test
	public void binarySearch() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertEquals(0, BinarySearch.search(array, 1));
	}

	@Test
	public void binarySearch1() {
		Integer[] array = { 1, 5, 6, 8, 23, 40, 324, 534 };

		Assert.assertEquals(5, BinarySearch.search(array, 40));
	}
	
	@Test
	public void binarySearch2() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertEquals(1, BinarySearch.search(array, 5));
	}
	
	@Test
	public void binarySearch3() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertEquals(5, BinarySearch.search(array, 324));
	}
	
	@Test
	public void binarySearch4() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertEquals(6, BinarySearch.search(array, 534));
	}

	@Test
	public void binarySearchFasle() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertEquals(-1, BinarySearch.search(array, 89));
	}

	@Test
	public void isPresent() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertTrue(BinarySearch.isPresent(array, 8));
	}

	@Test
	public void isPresentFalse() {
		Integer[] array = { 1, 5, 6, 8, 23, 324, 534 };

		Assert.assertFalse(BinarySearch.isPresent(array, 512));
	}

}
