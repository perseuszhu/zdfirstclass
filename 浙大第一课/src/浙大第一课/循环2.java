package ����һ��;

import java.util.Scanner;

public class ѭ��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		while (number>0)
		{
		number = number/10;
		count = count +1;
		}
		System.out.print(count);
		
	}

}
