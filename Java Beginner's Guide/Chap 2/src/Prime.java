//Find prime numbers between 2 and 100.
public class Prime {
	public static void main(String[] args) {
		
		for(int checkVal = 2; checkVal <= 100; checkVal++){
			boolean isPrime = true;
			for(int x = 2; x <= checkVal / x; x++) {
				if(checkVal % x == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.println(checkVal + " is prime.");
		}
	}
}