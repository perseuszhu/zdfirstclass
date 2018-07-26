package 浙大第一课;

import java.util.Scanner;

public class 定义函数 {

	public static void main(String[] args) {
		// TODO Aerated method stub
		Scanner in = new Scanner(System.in);
		int  i;
		int sum;
		sum = 0;
		for ( i = 1; i<=10; i++)
		{
			sum += i;
		}
		System.out.println(1+"到"+10+"的和是"+sum);
		sum = 0;
		for ( i = 20; i<=30; i++)
		{
			sum += i;
		}
		System.out.println(20+"到"+30+"的和是"+sum);
		sum = 0;
		for (i = 30; i<=40; i++)
		{
			sum += i;
		}
		System.out.println(30+"到"+40+"的和是"+sum);
		
	}

}
