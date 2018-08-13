package array;

public class Question8 {
	/**非原地旋转
	public void rotate(int[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < result.length; i++)
			for(int j = 0; j < result[0].length; j++)
				result[i][j] = matrix[matrix.length-1-j][i];
		matrix = result;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Question8 q8 = new Question8();
		q8.rotate(matrix);
	}
	*/
	
	//原地旋转
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n/2; i++) {
			for(int j = i; j < n-1-i; j++) {
				//按四个顶点顺时针旋转，再缩圈
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Question8 q8 = new Question8();
		q8.rotate(matrix);
	}
}
