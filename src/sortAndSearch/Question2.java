package sortAndSearch;

public class Question2 {
	private boolean isBadVersion(int version) {
		if(version < 4)
			return false;
		else
			return true;
	}
	
	public int firstBadVersion(int n) {
		int low = 1,high = n,middle = 0;
        while(low <= high){
            middle = low + (high-low)/2;
            if(isBadVersion(middle))
                high = middle - 1;
            else
                low = middle + 1;
        }
        return low;
	}
	
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		System.out.print(q2.firstBadVersion(5));
	}
}
