package assignment;

public class reverseNumber {
	
	public static int reverse(int num) {
		int reversed = 0;
		
		while(num > 0) {
			int digit = num % 10;
			reversed = reversed*10 + digit;
			num /= 10;
		}
		
		return reversed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 456332;
		int res = reverse(x);
		
		System.out.println("Original Numer -> " + x);
		System.out.println("Reverse Numer -> " + res);

	}

}
