package ����һ��;

import java.util.Scanner;

public class ����߷ֺ���ͷ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] score = new int[10];
		int max = 0;
		int min =100000;
		for (int i = 0; i<score.length; i++) 
		{
			score [i] = in.nextInt();
		}
		for ( int i = 0; i< score.length; i++)
		{
			if (max < score[i])
			max = score[i];
			if (min > score[i])
			min = score[i];
		}
		System.out.println("max:"+max+",min:"+min);
	
		
	}

}
