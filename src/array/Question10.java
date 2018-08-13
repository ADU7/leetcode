package array;

import java.util.ArrayList;

public class Question10 {
	public boolean isValidSudoku(char[][] board) {
		//检验行
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == '.')
					continue;
				else {
					if(!list.contains(board[i][j]))
						list.add(board[i][j]);
					else
						return false;
				}
			}
			list.clear();
		}
		
		//检查列
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[j][i] == '.')
					continue;
				else {
					if(!list.contains(board[j][i]))
						list.add(board[j][i]);
					else
						return false;
				}
			}
			list.clear();
		}
		
		//检查3*3宫格
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(!testSubBoard(i,j,list,board))
					return false;
			}
		}
		
		return true;
    }
	
	private boolean testSubBoard(int i, int j, ArrayList<Character> list,char[][] board) {
		//检查每个小宫格
		for(int m = 3*i; m < 3*i+3; m++) {
			for(int n = 3*j; n < 3*j+3; n++) {
				if(board[m][n] == '.')
					continue;
				else {
					if(!list.contains(board[m][n]))
						list.add(board[m][n]);
					else
						return false;
				}
			}
		}
		list.clear();
		return true;
	}
	
	public static void main(String[] args) {
		char[][] board = {{'.','.','.','.','5','.','.','1','.'},
						  {'.','4','.','3','.','.','.','.','.'},
						  {'.','.','.','.','.','3','.','.','1'},
						  {'8','.','.','.','.','.','.','2','.'},
						  {'.','.','2','.','7','.','.','.','.'},
						  {'.','1','5','.','.','.','.','.','.'},
						  {'.','.','.','.','.','2','.','.','.'},
						  {'.','2','.','9','.','.','.','.','.'},
						  {'.','.','4','.','.','.','.','.','.'}};
		Question10 q10 = new Question10();
		boolean result = q10.isValidSudoku(board);
		System.out.print(result);
	}
	
}
