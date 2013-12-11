import il.co.mobileapptec.algo.sort.MergeSort;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("MergSort");

		int[] array =  {190,45,70,34,78,90,70,23,65,900};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		new MergeSort().sort(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
