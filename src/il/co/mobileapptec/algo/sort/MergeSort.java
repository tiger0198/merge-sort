package il.co.mobileapptec.algo.sort;

public class MergeSort {

	public void sort(int[] array)
	{
		if (array == null || array.length <2)
			return ;
		mergeSort(array,0, array.length-1);
	}
	private void mergeSort(int[] array,int start,int end){
		
		if (start<end){
			int mid = (start + end)/2;
			mergeSort(array , start , mid);
			mergeSort(array , mid + 1, end);
			merge(array,start , mid , end);
		}
	}

	private void merge(int[] array,int start,int mid,int end )
	{
		//if (mid<end){
		int[] copyToArray = new int[end - start + 1];
		
		int leftIndex = start;
		int rightIndex = mid + 1;
		int arrayIndex = 0;
		while(leftIndex <= mid && rightIndex <= end){
			int currLeft = array[leftIndex];
			int currRight = array[rightIndex];
			if (currLeft<=currRight){
				copyToArray[arrayIndex] = currLeft; 
				leftIndex++;
			}else{
				copyToArray[arrayIndex] = currRight; 
				rightIndex++;
			}
			arrayIndex++;
			
		}
		while(leftIndex <= mid){
			copyToArray[arrayIndex] = array[leftIndex]; 
			leftIndex++;
			arrayIndex++;
		}
		while(rightIndex <= end){
			copyToArray[arrayIndex] = array[rightIndex]; 
			rightIndex++;
			arrayIndex++;
		}
		for (int i = 0 ; i<end - start + 1 ;i++){
			 array[start + i] = copyToArray[i] ;
		}
		//}
	}
}
