import java.util.Arrays;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}
	
	// INSERTION SORT
	// Best case = O(n), Average + Worst Case = O(n^2)
	public static int[] insertionSort(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	           arr[j+1] = arr[j];
	           j -= 1;
	        }
	        arr[j+1] = key;
	     }
	     return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 64, 3, 2, 4, 5, 5, 2, 12, 14, 5, 3, 0, -1};
		arr = insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
