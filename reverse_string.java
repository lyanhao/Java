public class reverse_string {
	public static String reverse(String s) {
		int length = s.length();
		String r = "";
		for(int i = length - 1; i >= 0; i--) {
			r += s.charAt(i);
		}
		return r;
	}
	public static void main(String[] args) {
		String r = "Hello";
		String a = reverse(r);
		System.out.println(a);
	}
}