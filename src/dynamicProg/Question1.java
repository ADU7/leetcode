package dynamicProg;

public class Question1 {
	public int climbStairs(int n) {
		if(n == 1)
			return 1;
        if(n == 2)
            return 2;
		int last = 2;
		int beforeLast = 1;
		int answer = 0;
		for(int i = 3; i <= n; i++) {
			answer = last + beforeLast;
			beforeLast = last;
			last = answer;
		}
		return answer;
    }
}
