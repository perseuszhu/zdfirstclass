package 浙大第一课;

import java.util.Scanner;

public class 质数 {

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
				System.out.println(n+"不是质数"+"i="+i);
				break;
			}
		}
		if (isPrime)
		{
			System.out.println(n+"是质数");
		}
		else 
		{
			System.out.println(n+"不是质数");
		}
	}

}
