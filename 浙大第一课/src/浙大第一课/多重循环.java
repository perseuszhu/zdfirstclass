package 浙大第一课;

import java.util.Scanner;

public class 多重循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int a = in.nextInt();
		for (int n =2; n <=a; n++)
		{
			int isPrime = 1;
			for (int i =2; i<n; i++)
			{
				if (n % i ==0)
				{
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1)
			{
				System.out.print(n+" ");
			}
			else 
			{
	//			System.out.println(n+"不是质数");
			}
		}
	}
}
