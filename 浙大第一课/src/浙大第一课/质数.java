package ����һ��;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean isPrime = true;
		for (int i =2; i<n; i++)
		{
			if (n % i ==0)
			{
				isPrime = false;
				System.out.println(n+"��������"+"i="+i);
				break;
			}
		}
		if (isPrime)
		{
			System.out.println(n+"������");
		}
		else 
		{
			System.out.println(n+"��������");
		}
	}

}
