package 浙大第一课;

import java.util.Scanner;

public class 售票 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		初始化
		Scanner in = new Scanner(System.in);
		int balance = 0;
//		读入投币金额
	while (true)
	{
			System.out.println("请投币:");
			int amount = in.nextInt();
			balance = balance +amount;
			if ( balance >=10 )
			{
		//		打印车票
				System.out.println("*******************");
				System.out.println("****    车票                ****");
				System.out.println("****  票价：十元         ****");
				System.out.println("*******************");
		//		打印并计算找零
				System.out.println("找零："+(balance-10));
				balance = 0;
			}
			else
			{
				System.out.println("余额不足,当前余额："+ balance);
			}
	}
		
	}
} 