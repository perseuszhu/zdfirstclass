package ����һ��;

import java.util.Scanner;

public class ��ƽ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		int count = 0;
		number = in.nextInt();
		while (number != -1)
		{
			sum = sum+number;
			count =count+1;
			number = in.nextInt();
		}
		if (count >0);
		{
		System.out.println("The Average is:"+(double)sum/count);
		}
		
	}

}
