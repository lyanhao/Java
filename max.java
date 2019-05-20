public class max {
	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		//int max = array[0];
		for (int item : array) {
			if (item > max) {
			max = item;
			}
		}
		/*for(i = 0; i < array.lenth; i++) {
			if(array[i] < array[i + 1]) {
				max = array[i + 1];
			}
		}*/
		return max;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int max = max(array);
		System.out.println("最大值是" + max);
	}
}