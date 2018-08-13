package sortAndSearch;

public class Question1 {
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums2.length ==0)
            return nums1;
		if(m == 0){
            for(int i = 0; i < nums2.length; i++)
                nums1[i] =  nums2[i];
            return nums1;
        }
		int[] nums3 = new int[m+n];
		for(int i = 0,j = 0,k = 0; i < m+n; i++) {
			if(nums1[j] < nums2[k]) {
				nums3[i] = nums1[j];
				if(++j == m) {
					for(;k < n; k++)
						nums3[j+k] = nums2[k];
					break;
				}
			} else {
				nums3[i] = nums2[k];
				if(++k == n) {
					for(; j < m; j++)
						nums3[k+j] = nums1[j];
					break;
				}
			}
		}
		//将nums3复制到nums1
		for(int j = 0; j < m+n; j++)
			nums1[j] = nums3[j];
		
		return nums1;
    }
	
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		int[] nums3 = q1.merge(nums1, m, nums2, n);
		for(int i = 0; i < nums3.length; i++)
			System.out.print(nums3[i] + " ");
	}
}
