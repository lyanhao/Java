public class binarySearch {
	public static int binarySearch(int[] array, int key) {
		int left = 0;
		int right = (array.length - 1);
		int mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(array[mid] > key) {
				right = mid - 1;
			}
			if(array[mid] < key) {
				left = mid + 1;
			}
			if(array[mid] == key) {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int key = 7;
		int bs = binarySearch(array,key);
		System.out.println(bs);
	}
}
