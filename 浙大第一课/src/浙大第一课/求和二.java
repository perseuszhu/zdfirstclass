package ����һ��;

import java.util.Scanner;

public class ��Ͷ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		int sign = 1;
		for (int i =1; i <=n; i++)
		{
			//sum +=sign * 1.0/i;
			//sign = -sign;
			if (i%2==1)
			{
				sum+=1.0/i;
			}
			else
			{
				sum-=1.0/i;
			}
		}
		System.out.println(sum);
		System.out.printf("%.2f",sum);
		
	}

}