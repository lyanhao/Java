public class DigitNum {
	public static int calcDigitNum(long a) {
	int count = 0;
	while(a > 0) {
		a = a / 10;
		count++;
	}
	return count;
	}
	public static void main(String [] args) {
		int count = calcDigitNum(194648);
		calcDigitNum(194648);
		System.out.printf("一共有%d位",count);
	}
}