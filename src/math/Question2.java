package math;

public class Question2 {
	//时间复杂度O(n^1.5)
//	public int countPrimes(int n) {
//		int count = 0;
//		for(int i = 1; i <= n; i++) {
//			if(isPrimes(i))
//				count++;
//		}
//		return count;
//    }
//	
//	private boolean isPrimes(int number) {
//		if(number <= 1)
//			return false;
//		for(int i = 2; i*i <= number; i++) {
//			if(number%i == 0)
//				return false;
//		}
//		return true;
//	}
	
	//空间复杂度O(n),时间复杂度O(nlog(logn))
	public int countPrimes(int n) {
		boolean[] isPrimes = new boolean[n];
		for(int i = 2; i < n; i++)
			isPrimes[i] = true;
		
		for(int i = 2; i*i < n; i++) {
			if(!isPrimes[i])
				continue;
			for(int j = i*i; j < n; j += i) {
				isPrimes[j] = false;
			}
		}
		
		int count = 0;
		for(int i = 2; i < n; i++) {
			if(isPrimes[i])
				count++;
		}
		return count;
	}
}
