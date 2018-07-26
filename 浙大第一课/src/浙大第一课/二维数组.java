package 浙大第一课;

import java.util.Scanner;

public class 二维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int [SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		// 读入矩阵
		for (int i = 0; i<board.length; i++) 
		{
			for (int j =0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		//检查行
		for (int i =0; i<SIZE; i++)
		{
			for (int j =0; j<SIZE; j++)
			{
				if (board[i][j] == 1)
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if (numOfX == SIZE || numOfO == SIZE)
			{
				gotResult = true;
				if(numOfX == SIZE)
				{
					System.out.println("X have won the game!");
				}
				else
					System.out.println("O have won the game!");
				break;
			}
		}
		if (numOfX == SIZE && numOfO == SIZE)
		{
			System.out.println("Round Draw!");
		}
		//检查列
		for ( int j = 0; j<SIZE; j++)
		{
			for ( int i= 0; i<SIZE; i++)
			{
				if (board[j][i] == 1)
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}
			}
			if (numOfX == SIZE || numOfO == SIZE)
			{
				gotResult = true;
				if(numOfX == SIZE)
				{
					System.out.println("X have won the game!");
				}
				else
					System.out.println("O have won the game!");
				break;
			}
		}
		if (numOfX == SIZE && numOfO == SIZE)
		{
			System.out.println("Round Draw!");
		}
	//检查对角线
		for (int i = 0; i<SIZE; i++)
		{
			int j = 0;
			if( board[i][j]== board[i+1][j+1] && board[i][j] == board[i+2][j+2])
			{
				gotResult = true;
				if (board[i][j] ==1)
				{
					System.out.println("X have won the game!");
				}
				else
					System.out.println("O have won the game!");
				break;
			}
			
		}
		for (int i =0; i<SIZE; i++)
		{
			int j = 2;
			if( board[i][j]== board[i+1][j-1] && board[i][j] == board[i+2][j-2])
			{
				gotResult = true;
				if (board[i][j] ==1)
				{
					System.out.println("X have won the game!");
				}
				else
					System.out.println("O have won the game!");
				break;
			}
			
		}
	}
}