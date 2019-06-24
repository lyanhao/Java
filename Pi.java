public class Pi {
	public static double calcPi(int n) {
		double Pi = 0;
		double add = 0;
		double min = 0;
		for(int i = 0;i < n; i++){
			int m = 2 * i + 1;
			if(i % 2 == 0){
				add += 1.0 / m;
			}else{
				min -= 1.0 / m;
			}
		}
		Pi = 4 * (add + min);
		return Pi;
	}	
	public static void main(String[] args) {
		double z = calcPi(1000000);
		System.out.printf("%f",z);
	}
}
