import static org.junit.Assert.*;
import il.co.mobileapptec.algo.sort.MergeSort;

import org.junit.Test;


public class TestMergeSort {

	@Test
	public void testMergeSortNullArray() {
		int[] array = null;
		int[] expected = null; 
		new MergeSort().sort(array);
		assertNull(array);
	}
	@Test
	public void testMergeSortArrayEmpty() {
		int[] array = {};
		int[] expected = {}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	
	@Test
	public void testMergeSortArrayOneItem() {
		int[] array = {1};
		int[] expected = {1}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	@Test
	public void testMergeSortTowItemsNotSorted() {
		int[] array = {4,2};
		int[] expected = {2,4}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	@Test
	public void testMergeSortTowItemsSorted() {
		int[] array = {2,4};
		int[] expected = {2,4}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	@Test
	public void testMergeSortEven() {
		int[] array = {190,45,34,78,90,23,65,900};
		int[] expected = {23 , 34 , 45 , 65 , 78 , 90 , 190 ,900}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	@Test
	public void testMergeSortOdd() {
		int[] array = {190,45,78,90,23,65,900};
		int[] expected = {23 , 45 , 65 , 78 , 90 , 190 ,900}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}
	@Test
	public void testMergeSortDuplicateItems() {
		int[] array = {190,45,78,90,75,23,65,75,900};
		int[] expected = {23 , 45 , 65 ,75,75, 78 , 90 , 190 ,900}; 
		new MergeSort().sort(array);
		assertArrayEquals(expected, array);
	}

}
