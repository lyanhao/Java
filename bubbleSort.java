import java.util.Arrays;
public class bubbleSort {
	public static void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
	// 无序区间： [0，array.length - i]
	// 有序区间： [array.length - i, array.length]
	public static void bubbleSort1(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
				swap(array, j, j + 1);
				}
			}
		}
	}
	
	public static void bubbleSort2(int[] array) {
		for(int i = 0; i < array.length; i++) {
			boolean isSwapped = false;
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
				swap(array, j, j + 1);
				isSwapped = true;
				}
			}
			if(!isSwapped) {
				return;
			}
		}
	}
	
	public static void bubbleSort3(int[] array) {
		for(int end = array.length; end > 0; end--) {
			boolean sorted = true;
			for(int i = 1; i < end; i++) {
				if(array[i - 1] > array[i]) {
					swap(array, i - 1, i);
					sorted = false;
				}
			}
			if(sorted == true) {
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array1 = {6,4,5,9,1,3,2,8,7};
		bubbleSort1(array1);
		bubbleSort2(array1);
		bubbleSort3(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array1));
	}
}