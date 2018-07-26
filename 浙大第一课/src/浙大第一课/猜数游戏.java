package 浙大第一课;

import java.util.Scanner;

public class 猜数游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);//[0,1)-->[1,100]
		int count =0;
		int a;
		do{
			count = count+1;
			a = in.nextInt();
			if (a> number)
			{
				System.out.println("Too big idiot.");
			}
			if (a< number)
			{
				System.out.println("Too Small you fool.");
			}
		} while(a!=number);
		System.out.println("Lucky Guess, can't believe that took you "+count+" times.");
		
		
		
	}

}
