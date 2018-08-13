package others;

public class Question2 {
	public int hammingDistance(int x, int y) {
        int diff = x^y;
        //调用位1的个数
        int flag = 1;
		int count = 0;
		while(flag != 0) {
			if((flag&diff) != 0)
				count++;
			flag = flag << 1;
		}
		return count;
    }
}
