package math;

public class Question3 {
	public boolean isPowerOfThree(int n) {
		if(n == 0)
			return false;
        if(n == 1)
            return true;
		boolean condition = true;
		while(condition) {
			if(n%3 != 0)
				return false;
			else
				n = n/3;
			if(n == 1)
				condition = false;
		}
		return true;
    }
}
