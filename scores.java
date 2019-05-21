public class scores {
	public static double average(int[] scores) {
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int sum = 0;
	int ave = 0;
	for(int i = 0; i < scores.length; i++) {
		if(scores[i] > max) {
			max = scores[i];
		}
		if(scores[i] < min) {
			min = scores[i];
		}
		sum += scores[i];
	}
		sum = sum - (min + max);
		ave = sum / (scores.length - 2);
	return ave;
	}
	
	public static void main(String[] args){
	int[] scores = {10, 9, 8, 7, 6};
	double ave = average(scores);
	System.out.println(ave);
	}
}